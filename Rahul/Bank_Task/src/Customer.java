public class Customer extends Basic_details {
    String Account_type;
    String Account_number;
    String Date_of_birth;
    String Father_name;
    Customer(String Name,String Account_type,String Account_number, char Gender,String Date_of_birth,String Father_name,int Age){
      this.Name = Name;
      this.Account_number = Account_number;
      this.Account_type = Account_type;
      this.Gender = Gender;
      this.Date_of_birth = Date_of_birth;
      this.Father_name = Father_name;
      this.Age = Age;
    }
}

import java.util.*;
public class Task_02_07{
	public static void main(String[] args){
		String name[] = {"Narasimha","Hemanth","Sumanth","Mohit Sai","Vijaya Lakshmi","Kavya sri","Akhila","Sai charan","Sathvika","Karishma","Aparna","Lakshmi Chaitanya","Rahul","Sai Kumar","Raghu","Suvarchala","Saideepa","Siva Nageswararao","Sai Kiran"};
		int java_marks[]={92,86,95,42,15,45,89,85,85,72,62,35,99,69,36,85,46,13,28};
		int html_marks[] = {90,80,98,52,80,55,79,26,74,62,69,89,98,96,56,86,64,93,65};
		int sql_marks[] = {80,79,18,45,60,56,89,50,79,52,56,53,98,23,82,58,89,24,42};
		int js_marks[] = {74,56,23,89,50,36,59,85,62,89,26,46,97,73,32,89,13,68,89};
		System.out.format("| %-17s |%-8s | %-11s| %-10s| %-10s |%-18s| %-10s |\n", "Name", "Total","Average","Percentage","Pass/fail","Failed in subject","Grade" );
		System.out.format("| %-17s |%-8s | %-11s| %-10s| %-10s |%-18s| %-10s |\n","","","","","","","");
		int min_java=Integer.MAX_VALUE,min_html=Integer.MAX_VALUE,min_sql=Integer.MAX_VALUE,min_js=Integer.MAX_VALUE;
		int max_java= Integer.MIN_VALUE,max_html=Integer.MIN_VALUE,max_sql=Integer.MIN_VALUE,max_js=Integer.MIN_VALUE;
		int java_min_i = -1, java_max_i = -1, html_min_i = -1, html_max_i = -1, sql_max_i = -1, sql_min_i = -1, js_max_i = -1, js_min_i= -1; 
		for(int i=0;i<name.length;i++){
			int sum = (java_marks[i]+html_marks[i]+sql_marks[i]+js_marks[i]);
			float perc = (sum/400f)*100.0f;
			int avg = (int)perc;
			String res = "";
			String ans = "";
			String grade = "";
			if(perc>=50 && perc<60){
				grade = "C ";
			}
			else if(perc>=60 && perc<70){
				grade = "B ";
			}
			else if(perc>=70 && perc<90){
				grade = "A ";
			}
			else if(perc>=90){
				grade = "A+ ";
			}
			else{
				grade = "C-";
			}
			if(min_java>java_marks[i]){
				min_java = java_marks[i];
				java_min_i = i;
			}
			if(max_java<java_marks[i]){
				max_java = java_marks[i];
				java_max_i = i;
			}
			if(min_html>html_marks[i]){
				min_html = html_marks[i];
				html_min_i = i;
			}
			if(max_html<html_marks[i]){
				max_html = html_marks[i];
				html_max_i = i;
			}
			if(min_sql>sql_marks[i]){
				min_sql = sql_marks[i];
				sql_min_i = i;
			}
			if(max_sql<sql_marks[i]){
				max_sql = sql_marks[i];
				sql_max_i = i;
			}
			if(min_js>js_marks[i]){
				min_js = js_marks[i];
				js_min_i = i;
			}
			if(max_js<js_marks[i]){
				max_js = js_marks[i];
				js_max_i = i;
			}
			if(java_marks[i]>=35){
				if(html_marks[i]>=35){
					if(sql_marks[i]>=35){
						if(js_marks[i]>=35)
						{
							res="PASS";
							ans = "NA";
						}
						else{
							res = "FAIL";
							ans = "JS";

						}
					}
					else{
						res = "FAIL";
						ans = "SQL";
					}
				}
				else{
					res = "FAIL";
					ans = "HTML";
				}
			}
			else{
				res = "FAIL";
				ans = "JAVA";
			}
			
			System.out.format("| %-17s |%-8d | %-10d |%-11f| %-11s|%-18s|%-10s | \n", name[i], sum,avg,perc,res,ans,grade );
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.format("| %-17s |%-10s | %-25s|%-10s|%-25s| \n", "Subject Name", "MIN MARKS","Student with min marks","MAX MARKS","Student with max marks" );
		System.out.format("| %-17s |%-10s | %-25s|%-10s|%-25s| \n", "JAVA", min_java,name[java_min_i],max_java,name[java_max_i]);
		System.out.format("| %-17s |%-10s | %-25s|%-10s|%-25s| \n", "HTML", min_html,name[html_min_i],max_html,name[html_max_i]);
		System.out.format("| %-17s |%-10s | %-25s|%-10s|%-25s| \n", "SQL", min_sql,name[sql_min_i],max_sql,name[sql_max_i]);
		System.out.format("| %-17s |%-10s | %-25s|%-10s|%-25s| \n", "JS", min_js,name[js_min_i],max_js,name[js_max_i]);
	}
}
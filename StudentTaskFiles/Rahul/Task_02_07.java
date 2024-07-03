import java.util.*;
public class Task_02_07{
	public static void main(String[] args){
		String name[] = {"Narasimha","Hemanth","Sumanth","Mohit Sai","Vijaya Lakshmi","Kavya sri","Akhila","Sai charan","Sathvika","Karishma","Aparna","Lakshmi Chaitanya","Rahul","Sai Kumar","Raghu","Suvarchala","Saideepa","Siva Nageswararao","Sai Kiran"};
		int java_marks[]={92,86,95,42,15,45,89,85,85,72,62,35,99,69,36,85,46,13,28};
		int html_marks[] = {90,80,98,52,80,55,79,26,74,62,69,89,98,96,56,86,64,93,65};
		int sql_marks[] = {80,79,18,45,60,56,89,50,79,52,56,53,98,23,82,58,89,24,42};
		int js_marks[] = {74,56,23,89,50,36,59,85,62,89,26,46,97,73,32,89,13,68,89};
		System.out.format("| %-17s |%-8s | %-10s| %-10s |\n", "Name", "Total","Average","Pass/fail" );
		int min_java=Integer.MAX_VALUE,min_html=Integer.MAX_VALUE,min_sql=Integer.MAX_VALUE,min_js=Integer.MAX_VALUE;
		int max_java= Integer.MIN_VALUE,max_html=Integer.MIN_VALUE,max_sql=Integer.MIN_VALUE,max_js=Integer.MIN_VALUE;
		for(int i=0;i<name.length;i++){
			int sum = (java_marks[i]+html_marks[i]+sql_marks[i]+js_marks[i]);
			float avg = sum/4.0f;
			String res = "";
			if(min_java>java_marks[i]){
				min_java = java_marks[i];
			}
			if(max_java<java_marks[i]){
				max_java = java_marks[i];
			}
			if(min_html>html_marks[i]){
				min_html = html_marks[i];
			}
			if(max_html<html_marks[i]){
				max_html = html_marks[i];
			}
			if(min_sql>sql_marks[i]){
				min_sql = sql_marks[i];
			}
			if(max_sql<sql_marks[i]){
				max_sql = sql_marks[i];
			}
			if(min_js>js_marks[i]){
				min_js = js_marks[i];
			}
			if(max_js<js_marks[i]){
				max_js = js_marks[i];
			}
			if(java_marks[i]>=35 && html_marks[i]>=35 && sql_marks[i]>=35 && js_marks[i]>=35){
				res = "PASS";
			}
			else{
				res = "FAIL";
			}
			System.out.format("| %-17s |%-8d | %-10f| %-11s| \n", name[i], sum,avg,res );
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.format("| %-17s |%-10s | %-10s| \n", "Subject Name", "MIN MARKS","MAX MARKS" );
		System.out.format("| %-17s |%-10d | %-10d| \n", "JAVA", min_java,max_java);
		System.out.format("| %-17s |%-10d | %-10d| \n", "HTML", min_html,max_html);
		System.out.format("| %-17s |%-10d | %-10d| \n", "SQL", min_sql,max_sql);
		System.out.format("| %-17s |%-10d | %-10d| \n", "JS", min_js,max_js);
	}
}
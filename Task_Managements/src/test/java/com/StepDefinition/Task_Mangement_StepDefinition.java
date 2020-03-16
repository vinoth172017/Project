package com.StepDefinition;


import com.ExcelUtilitty.Task_Management_Exelulities;
import com.Pages.Task_Management_AddTask;
import com.Pages.Task_Management_Login;
import com.Pages.Task_Management_PrintTaskList;
import com.Pages.Task_Mangement_Search;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Task_Mangement_StepDefinition {
		//login pages
		Task_Management_Login tm=new Task_Management_Login();
		Task_Management_Exelulities exel = new Task_Management_Exelulities();
		//add task
		Task_Management_AddTask Ta=new Task_Management_AddTask();
		//Search
		Task_Mangement_Search tms=new Task_Mangement_Search();
		//print
		Task_Management_PrintTaskList tmp=new Task_Management_PrintTaskList();
		

//login	
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 tm.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
	}

	@When("^Clicking on Administration to nagivate Login Page$")
	public void clicking_on_Administration_to_nagivate_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   tm.LoginPage();
	}

	@Then("^The user login using username and password$")
	public void the_user_login_using_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Task_Management_Exelulities exel = new Task_Management_Exelulities();
		tm.LoginDetails(exel.Task_Management_username(1),exel.Task_Management_password(1));
		  tm.loginclick();
		    int count=exel.row_count();
		    for(int i=2;i<=count;i++)
		    {
		    tm.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		    tm.LoginPage();
		    tm.LoginDetails(exel.Task_Management_username(i),exel.Task_Management_password(i));
		    if (i==2) {
		    	 tm.loginclick();
		    }
		    }
	}

	@Then("^Click on login Button$")
	public void click_on_login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tm.loginclick();
	}
//Add Task
	@When("^Click AddTask and login$")
	public void click_AddTask_and_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Ta.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		Ta.LoginDetails(exel.Task_Management_username(1),exel.Task_Management_password(1));

	}
	@Then("^Clicking on AddTask to nagivate Add Task Page$")
	public void clicking_on_AddTask_to_nagivate_Add_Task_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Ta.TaskDeatils();
	}

	@Then("^Click on Addbutton to add Task$")
	public void click_on_Addbutton_to_add_Task() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Ta.AddTask();
	}
//Search
	@Then("^Enter Correct Details to search$")
	public void enter_Correct_Details_to_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tms.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");
		tms.searchdetails();
	}

	@Then("^Click Search Button to Get Details$")
	public void click_Search_Button_to_Get_Details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tms.search();
	}
//print
	@Then("^Print the home page Task Table in the console$")
	public void print_the_home_page_Task_Table_in_the_console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tmp.ChromeLaunch("chrome", "http://examples.codecharge.com/TaskManager/Default.php");	
		tmp.printtable();
	}
	
}

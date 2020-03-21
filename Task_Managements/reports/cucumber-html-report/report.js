$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Taskmanagement.Feature");
formatter.feature({
  "line": 2,
  "name": "Task_Management Website",
  "description": "",
  "id": "task-management-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Task_Management"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "Login into Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC_01_Login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Clicking on Administration to nagivate Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The user login using username and password with vaild and invaild deatils",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 6604625200,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.clicking_on_Administration_to_nagivate_Login_Page()"
});
formatter.result({
  "duration": 1531974300,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_login_using_username_and_password()"
});
formatter.result({
  "duration": 21053250900,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_login_Button()"
});
formatter.result({
  "duration": 320030400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "Add Task in Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@TC_02_Add_Task"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Click AddTask and login",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Clicking on AddTask to nagivate Add Task Page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click on Addbutton to add Task",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_AddTask_and_login()"
});
formatter.result({
  "duration": 11401138700,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.clicking_on_AddTask_to_nagivate_Add_Task_Page()"
});
formatter.result({
  "duration": 6765930600,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_Addbutton_to_add_Task()"
});
formatter.result({
  "duration": 4174145400,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "Searching in Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@TC_03_Search_Task"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Enter Correct Details to search",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Click Search Button to Get Details",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.enter_Correct_Details_to_search()"
});
formatter.result({
  "duration": 4638218500,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_Search_Button_to_Get_Details()"
});
formatter.result({
  "duration": 4218592000,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "",
  "description": "Printing Task Table in Task_Mangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@TC_04_Task_Table_Printing"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "Print the home page Task Table in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.print_the_home_page_Task_Table_in_the_console()"
});
formatter.result({
  "duration": 11945583300,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "",
  "description": "Add/Edit Task in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@TC_05_Edit"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "Click any task from the Tasks list",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Edit any one field from Add/Edit task",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Click on submit Button",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_any_task_from_the_Tasks_list()"
});
formatter.result({
  "duration": 9392798000,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.edit_any_one_field_from_Add_Edit_task()"
});
formatter.result({
  "duration": 334104500,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_submit_Button()"
});
formatter.result({
  "duration": 7442657900,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "",
  "description": "Deleting a Task in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@TC_06_Delete"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "Click any task from tasks list",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Click delete button to delete details",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_any_task_from_tasks_list()"
});
formatter.result({
  "duration": 10160839500,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_delete_button_to_delete_details()"
});
formatter.result({
  "duration": 4501565400,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "",
  "description": "Checking Deleted details is show are not in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@TC_07_Searching_Delete_Task"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "Fill the deleted details in Search box",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Click the search button",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "Print the search result",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.fill_the_deleted_details_in_Search_box()"
});
formatter.result({
  "duration": 4493047300,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_the_search_button()"
});
formatter.result({
  "duration": 1391681300,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.print_the_search_result()"
});
formatter.result({
  "duration": 7388884100,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "",
  "description": "Searching Project in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 50,
      "name": "@TC_08_TaskList_Search"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "Search as Codecharge in Project",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "click on the search button get the result",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_dropdown_box_in_project_from_search_and_select_codecharge()"
});
formatter.result({
  "duration": 6376842900,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_the_search_button()"
});
formatter.result({
  "duration": 8313273000,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "",
  "description": "  Printing anyone user from employee Deatils in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 56,
      "name": "@Tc_09_Employees_list_printing"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "Clicking Adminstration",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "Click on employee details",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "Print the anyone Employees list in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.clicking_Adminstration()"
});
formatter.result({
  "duration": 7377865000,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_employee_details()"
});
formatter.result({
  "duration": 878891000,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.print_the_anyone_Employees_list_in_the_console()"
});
formatter.result({
  "duration": 7294991200,
  "status": "passed"
});
formatter.scenario({
  "line": 64,
  "name": "",
  "description": "    Add New Employee in Employee list",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 63,
      "name": "@TC_10_Add_Employee"
    }
  ]
});
formatter.step({
  "line": 66,
  "name": "the user click on Administartion and Login is proceeded",
  "keyword": "When "
});
formatter.step({
  "line": 67,
  "name": "the user click on Employee field",
  "keyword": "Then "
});
formatter.step({
  "line": 68,
  "name": "the user click on Add Employee field and enter the credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "click on Add button",
  "keyword": "And "
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_click_on_Administartion_and_Login_is_proceeded()"
});
formatter.result({
  "duration": 11936929200,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_click_on_Employee_field()"
});
formatter.result({
  "duration": 861827200,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_click_on_Add_Employee_field_and_enter_the_credentials()"
});
formatter.result({
  "duration": 1928014900,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_Add_button()"
});
formatter.result({
  "duration": 5231842600,
  "status": "passed"
});
formatter.scenario({
  "line": 72,
  "name": "",
  "description": "  To check the added employee getting logged in",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 71,
      "name": "@TC_11_Check_Login"
    }
  ]
});
formatter.step({
  "line": 74,
  "name": "the user click on Administration tab",
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "the user enters login credentials and clicks login",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_click_on_Administration_tab()"
});
formatter.result({
  "duration": 6896141800,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_enters_login_credentials_and_clicks_login()"
});
formatter.result({
  "duration": 9846415700,
  "status": "passed"
});
formatter.scenario({
  "line": 78,
  "name": "",
  "description": "   To add Hold Type",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 77,
      "name": "@TC_12_Add_Hold_Type"
    }
  ]
});
formatter.step({
  "line": 80,
  "name": "the user click  Administration tab and do valid login",
  "keyword": "When "
});
formatter.step({
  "line": 81,
  "name": "the user click on Types field and clicks Add New Type",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "the user enters Type Name and submit",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_click_Administration_tab_and_do_valid_login()"
});
formatter.result({
  "duration": 7896814900,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_click_on_Types_field_and_clicks_Add_New_Type()"
});
formatter.result({
  "duration": 2080404900,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_enters_Type_Name()"
});
formatter.result({
  "duration": 9558709300,
  "status": "passed"
});
formatter.scenario({
  "line": 85,
  "name": "",
  "description": " To search closed status",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 84,
      "name": "@TC_13_search_closed_status"
    }
  ]
});
formatter.step({
  "line": 87,
  "name": "the status field is inspected and search button is clicked",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_status_field_is_inspected_and_search_button_is_clicked()"
});
formatter.result({
  "duration": 14276887800,
  "status": "passed"
});
formatter.scenario({
  "line": 90,
  "name": "",
  "description": "",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 89,
      "name": "@TC_14_Print_the_priority_field"
    }
  ]
});
formatter.step({
  "line": 91,
  "name": "Priority field is inspected and search button should be clicked",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "Print Task table",
  "keyword": "And "
});
formatter.match({
  "location": "TaskMangementStepdefinition.priority_field_is_inspected_and_search_button_should_be_clicked()"
});
formatter.result({
  "duration": 5803055700,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.print_Task_table()"
});
formatter.result({
  "duration": 8582864500,
  "status": "passed"
});
});
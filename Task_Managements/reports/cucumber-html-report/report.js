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
  "name": "The user launch the Chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Clicking on administration to nagivate Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The user login using username and password with vaild and invaild deatils",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Clicking on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 10680368000,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.clicking_on_Administration_to_nagivate_Login_Page()"
});
formatter.result({
  "duration": 1872115000,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_login_using_username_and_password()"
});
formatter.result({
  "duration": 28360017800,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_login_Button()"
});
formatter.result({
  "duration": 253845600,
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
  "name": "Click on AddTask and login",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Enter the task details",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click on addbutton to add Task",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_AddTask_and_login()"
});
formatter.result({
  "duration": 11677058400,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.clicking_on_AddTask_to_nagivate_Add_Task_Page()"
});
formatter.result({
  "duration": 7927549400,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_Addbutton_to_add_Task()"
});
formatter.result({
  "duration": 4497127700,
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
  "name": "Enter correct details to search the added task",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Click on search button to get the details of the task",
  "keyword": "When "
});
formatter.match({
  "location": "TaskMangementStepdefinition.enter_Correct_Details_to_search()"
});
formatter.result({
  "duration": 6665244900,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_Search_Button_to_Get_Details()"
});
formatter.result({
  "duration": 8564486500,
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
  "name": "Open the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "In task web table get the first row in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.Open_the_home_page()"
});
formatter.result({
  "duration": 6384863200,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 32,
  "name": "",
  "description": "Add/Edit Task in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@TC_05_Edit"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "Click first task from the tasks list",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "Edit name field from Add/Edit task",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Click on submit Button to update task",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_any_task_from_the_Tasks_list()"
});
formatter.result({
  "duration": 10888701800,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.edit_any_one_field_from_Add_Edit_task()"
});
formatter.result({
  "duration": 621972400,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_submit_Button()"
});
formatter.result({
  "duration": 7534299800,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "",
  "description": "Deleting a Task in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@TC_06_Delete"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "Click first task from tasks list",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "Click delete button to delete the task",
  "keyword": "When "
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_any_task_from_tasks_list()"
});
formatter.result({
  "duration": 11506328900,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_delete_button_to_delete_details()"
});
formatter.result({
  "duration": 8670997000,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "",
  "description": "Checking Deleted details is show are not in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@TC_07_Searching_Delete_Task"
    }
  ]
});
formatter.step({
  "line": 47,
  "name": "Fill the deleted task details in Search box",
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "Click the search button",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "Print the search result in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.fill_the_deleted_details_in_Search_box()"
});
formatter.result({
  "duration": 5483937200,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_the_search_button()"
});
formatter.result({
  "duration": 1293163500,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.print_the_search_result()"
});
formatter.result({
  "duration": 7134970800,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "",
  "description": "Searching Codecharge Project in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@TC_08_TaskList_Search"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "Search as Codecharge in Project",
  "keyword": "Given "
});
formatter.step({
  "line": 55,
  "name": "click on the search button get the search result",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_dropdown_box_in_project_from_search_and_select_codecharge()"
});
formatter.result({
  "duration": 7040946500,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_the_search_button()"
});
formatter.result({
  "duration": 8158525800,
  "status": "passed"
});
formatter.scenario({
  "line": 58,
  "name": "",
  "description": "  Printing anyone employee name and email from employee Deatils in TaskMangement Website",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 57,
      "name": "@Tc_09_Employees_list_printing"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "Clicking Adminstration",
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "Click on employee details",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "Print the anyone Employee name and email in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.clicking_Adminstration()"
});
formatter.result({
  "duration": 9885340200,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_employee_details()"
});
formatter.result({
  "duration": 841689400,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.print_the_anyone_Employees_list_in_the_console()"
});
formatter.result({
  "duration": 7243454400,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "",
  "description": "    Add New Employee in Employee list",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 64,
      "name": "@TC_10_Add_Employee"
    }
  ]
});
formatter.step({
  "line": 67,
  "name": "the user click on administartion and login is proceeded",
  "keyword": "Given "
});
formatter.step({
  "line": 68,
  "name": "the user click on employee field",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "the user click on add employee field and enter the credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "click on add button",
  "keyword": "And "
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_click_on_Administartion_and_Login_is_proceeded()"
});
formatter.result({
  "duration": 11858505200,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_click_on_Employee_field()"
});
formatter.result({
  "duration": 721957700,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_click_on_Add_Employee_field_and_enter_the_credentials()"
});
formatter.result({
  "duration": 1864084400,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.click_on_Add_button()"
});
formatter.result({
  "duration": 9385005400,
  "status": "passed"
});
formatter.scenario({
  "line": 73,
  "name": "",
  "description": "  To check the added employee getting logged in",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 72,
      "name": "@TC_11_Check_Login"
    }
  ]
});
formatter.step({
  "line": 75,
  "name": "the user click on Administration tab",
  "keyword": "Given "
});
formatter.step({
  "line": 76,
  "name": "the user enters login credentials and clicks login",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_click_on_Administration_tab()"
});
formatter.result({
  "duration": 6018480300,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_enters_login_credentials_and_clicks_login()"
});
formatter.result({
  "duration": 9588941100,
  "status": "passed"
});
formatter.scenario({
  "line": 79,
  "name": "",
  "description": "   To add Hold Type",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 78,
      "name": "@TC_12_Add_Hold_Type"
    }
  ]
});
formatter.step({
  "line": 81,
  "name": "the user click  Administration tab and do valid login",
  "keyword": "Given "
});
formatter.step({
  "line": 82,
  "name": "the user click on Types field and clicks Add New Type",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "the user enters Type Name and submit",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_click_Administration_tab_and_do_valid_login()"
});
formatter.result({
  "duration": 9540608600,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_click_on_Types_field_and_clicks_Add_New_Type()"
});
formatter.result({
  "duration": 2067624800,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_enters_Type_Name()"
});
formatter.result({
  "duration": 5570283300,
  "status": "passed"
});
formatter.scenario({
  "line": 86,
  "name": "",
  "description": " To search closed status",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 85,
      "name": "@TC_13_search_closed_status"
    }
  ]
});
formatter.step({
  "line": 88,
  "name": "the user enter the home page and select the status",
  "keyword": "Given "
});
formatter.step({
  "line": 89,
  "name": "the status field is inspected and search button is clicked",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_user_enter_the_home_page_and_select_the_status()"
});
formatter.result({
  "duration": 7265665000,
  "status": "passed"
});
formatter.match({
  "location": "TaskMangementStepdefinition.the_status_field_is_inspected_and_search_button_is_clicked()"
});
formatter.result({
  "duration": 9789958500,
  "status": "passed"
});
formatter.scenario({
  "line": 92,
  "name": "",
  "description": "",
  "id": "task-management-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 91,
      "name": "@TC_14_Print_the_priority_field"
    }
  ]
});
formatter.step({
  "line": 93,
  "name": "Priority field is inspected and search button should be clicked",
  "keyword": "Given "
});
formatter.step({
  "line": 94,
  "name": "Print the priority high Task table in the console",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskMangementStepdefinition.priority_field_is_inspected_and_search_button_should_be_clicked()"
});
formatter.result({
  "duration": 6329598100,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
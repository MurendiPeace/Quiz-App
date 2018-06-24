# Quiz-App

This is a quiz app about South Africa, a user will be asked six basic questions about South Africa and is supposed to answer all of the questions, each question has a correct answer/s. And after completing the quiz, the user will get the recordof the score he/she got out of six questions in a form of a toast message and also be able to get the Memo for all the questions in brief explantion and also be able to send an email to me that reads that you have completed to quiz

My Android App consists of two Layouts, Main activity and Memo activity

In the Main activity.
The main activity consist of an EditText view which a user has to write their name. After writing his/her name, the user can then start answering the questions, questions are in a form of a free response text, check box (for questions with multiple answers) and radio buttons (for questions with only one answers). In this App, after all the questions Views there is a button (Submit answers) which opens another activity and also gives you a toast message indicating the number of questions you got correct out of six, and note that all questions have correct answers. The submitt button does not work unless the Name textfield is filled and all questions are answered. After answering all questions and filling the Name textfield, when you click the submit answers button it will make a toast message which shows how many questions you answered correct and then open the Memo activity.

In the Memo activity.
The memo activity consist of a text which thanks the user for completing the quiz and also contains a selectable text ("click here"), when you click on the text you shall be able to get the the Memo i.e the answers for all the six questions, in brief. Below the texts, there's a button (Submit quiz), in the button I have implemented an email Intent which is just suppose to send an email that the quiz has been submited, to me, that's all.

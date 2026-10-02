# LifeHackUrbanMythApp
Android app using Kotlin to test life hacks vs urban myths
Student Name: Amanda Morokong
Student Number: ST1O358143
Module: IMAD

## 1. Purpose of the App
The purpose of this Android application is to test users' ability to distinguish between genuine life hacks and common urban myths. Misinformation spreads rapidly on social media platforms like TikTok and WhatsApp (e.g., "charging your phone in a microwave"). This app provides a fun, interactive TRUE/FALSE quiz to educate users and debunk dangerous or useless myths while highlighting useful, real-world shortcuts.

Problem it solves: Combating misinformation about daily life hacks.
Target Audience: Anyone who uses social media and wants to test their common sense.

## 2. Tools and Technologies Used
Language: Kotlin
Integrated Development Environment (IDE): Android Studio
Platform:Android (tested on Pixel Emulator)
UI Design: XML Layouts (ConstraintLayout / LinearLayout)
Application Logic: Android Activities, Intents, and Data Classes
Version Control: Git & GitHub
Automated Build: GitHub Actions

## 3. Project Structure
text
app/src/main/
├── java/com/example/lifehackmyth/
│   MainActivity.kt       -> First screen, welcome page
│   QuizActivity.kt       -> Quiz logic, questions, score counting
│   ScoreActivity.kt      -> Shows final score and personalized feedback
│   Question.kt           -> Data class for questions
│
├── res/layout/
│   activity_main.xml     -> Purple welcome screen
│   activity_quiz.xml     -> Question + TRUE / FALSE buttons
│   activity_score.xml    -> Final score screen
│
└── AndroidManifest.xml   -> Registers all activities

## 4. How the App Works
a) Welcome Screen (activity_main.xml + MainActivity.kt)
The entry point of the app. It displays a brief description and a "Start" button. When the user clicks "Start", an Intent is used to navigate to the QuizActivity.
b) Quiz Screen (activity_quiz.xml + QuizActivity.kt)
This is the core logic of the app.
• It contains a list of Question objects (String for the statement, Boolean for whether it's a hack or myth, and a String for the explanation).
• Variables track the currentQuestionIndex and the user's score.
• Two buttons (btnTrue and btnFalse) allow the user to answer.
• A showQuestion() function updates the UI.
• Conditional logic (if/else) checks if the user's answer is correct. If correct, the score increments.
• When the user clicks "Next", the index increases. If the index exceeds the list size, the app navigates to the ScoreActivity, passing the final score using intent.putExtra("score", score).
c) Score Screen (activity_score.xml + ScoreActivity.kt)
• Receives the final score from the QuizActivity using intent.getIntExtra("score", 0).
• Displays the total score (e.g., "You scored 4 / 5").
• Provides personalized feedback based on the score (e.g., "Master Hacker!" for high scores vs. "Stay Safe Online!" for lower scores).
• Includes a "Review" button to view the statements and explanations.
• Includes a "Play Again" button that navigates back to MainActivity.
d) AndroidManifest.xml
All activities (QuizActivity, ScoreActivity) are registered here to ensure Android OS recognizes them and prevents app crashes during navigation.
 
## 5. Key Concepts Implemented
• Activities: Different screens of the app.
• Intents: Used to navigate between activities and pass data (the score).
• findViewById: Connects Kotlin code to XML UI components.
• setOnClickListener: Listens for user button clicks.
• Conditional Logic (if/else): Used to check correct answers and calculate final scores.
• Data Classes: Used to structure the quiz questions neatly.
• Logging: Log.d() statements are included throughout the code to track app lifecycle and user interactions for debugging.

6. Version Control and Automated Testing (GitHub & GitHub Actions)
• GitHub Repository: All source code is committed and pushed regularly to this repository.
• GitHub Actions: A workflow (build.yml) is set up in the .github/workflows/ directory. This automates the build process, ensuring the app compiles correctly in a clean environment every time code is pushed to the main branch.

7. Video Presentation
 A comprehensive video presentation showcasing the app's features, code structure, and functionality can be viewed here:

 
8. Screenshots:
Welcome Screen
<img width="917" height="419" alt="WELCOME SCREEN" src="https://github.com/user-attachments/assets/275b4035-9a95-43e5-aa36-13d716eed390" />

Quiz Screen:
<img width="913" height="416" alt="QUIZ SCREEN" src="https://github.com/user-attachments/assets/a85b46a9-a61d-4618-aa26-912e32be68c2" />
<img width="890" height="418" alt="QUIZ NO2" src="https://github.com/user-attachments/assets/96f55e83-a0b3-4331-b798-d5c35eaf0231" />

Score Screen:
<img width="922" height="449" alt="SCORE" src="https://github.com/user-attachments/assets/579405d3-3263-42a6-bd7c-44488e4812b9" />


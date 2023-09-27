
package com.example.lasustaffconnect

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView

class PActActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_policy)

        var txt_title = findViewById(R.id.txt_title) as TextView
        var txt_overview = findViewById(R.id.txt_overview) as TextView
        var txt_view_policy = findViewById(R.id.txt_view_policy) as TextView
        var txt_abt_policy = findViewById(R.id.txt_abt_policy) as TextView
        var txt_policy = findViewById(R.id.txt_policy) as TextView


        txt_title.text = "Procurement Act"

        txt_overview.text = "Overview"
        txt_view_policy.text = "View Acts"

        txt_view_policy.setOnClickListener {
            txt_view_policy.setTypeface(null, Typeface.BOLD);
            txt_policy.text = "Reduced Paperwork: By digitizing policies and guidelines, the app contributes to the university's sustainability efforts by reducing the need for printed materials.\n" +
                    "\n" +
                    "Improved Compliance: Easy access to policies and guidelines encourages compliance, reducing instances of unintentional rule violations.\n" +
                    "\n" +
                    "Enhanced Communication: The app facilitates better communication between students, faculty, and administrators, as it serves as a common platform for policy-related information.\n" +
                    "\n" +
                    "Empowerment: Knowledge is power. The app empowers users by providing them with the information they need to make informed decisions and take appropriate actions.\n" +
                    "\n" +
                    "Conclusion\n" +
                    "\n" +
                    "The \"University Policy Hub\" app is a valuable addition to any educational institution, promoting transparency, efficiency, and user empowerment. It streamlines the process of accessing policies and guidelines, making the university experience smoother for everyone involved. By keeping the entire university community well-informed, it contributes to a positive and compliant campus environment.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "User\n" +
                    "\n" +
                    "2 / 2\n" +
                    "\n" +
                    "write a brieft statement for a policy\n" +
                    "ChatGPT\n" +
                    "Policy Title: Flexible Work Arrangements\n" +
                    "\n" +
                    "Statement:\n" +
                    "The Flexible Work Arrangements policy aims to support a diverse and inclusive workplace by providing employees with opportunities to achieve a healthy work-life balance. This policy outlines the guidelines and procedures for requesting and implementing flexible work arrangements, such as telecommuting, flexible hours, or job sharing, while ensuring that the organization's operational needs and productivity goals are met. It is our commitment to fostering a work environment that values employee well-being and recognizes the importance of accommodating\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n"
        }

        txt_overview.setOnClickListener {
            txt_overview.setTypeface(null, Typeface.BOLD);
            txt_policy.text = "Reduced Paperwork: By digitizing policies and guidelines, the app contributes to the university's sustainability efforts by reducing the need for printed materials.\n" +
                    "\n" +
                    "Improved Compliance: Easy access to policies and guidelines encourages compliance, reducing instances of unintentional rule violations.\n" +
                    "\n" +
                    "Enhanced Communication: The app facilitates better communication between students, faculty, and administrators, as it serves as a common platform for policy-related information.\n" +
                    "\n" +
                    "Empowerment: Knowledge is power. The app empowers users by providing them with the information they need to make informed decisions and take appropriate actions.\n" +
                    "\n" +
                    "Conclusion\n" +
                    "\n" +
                    "The \"University Policy Hub\" app is a valuable addition to any educational institution, promoting transparency, efficiency, and user empowerment. It streamlines the process of accessing policies and guidelines, making the university experience smoother for everyone involved. By keeping the entire university community well-informed, it contributes to a positive and compliant campus environment.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "User\n" +
                    "\n" +
                    "2 / 2\n" +
                    "\n" +
                    "write a brieft statement for a policy\n" +
                    "ChatGPT\n" +
                    "Policy Title: Flexible Work Arrangements\n" +
                    "\n" +
                    "Statement:\n" +
                    "The Flexible Work Arrangements policy aims to support a diverse and inclusive workplace by providing employees with opportunities to achieve a healthy work-life balance. This policy outlines the guidelines and procedures for requesting and implementing flexible work arrangements, such as telecommuting, flexible hours, or job sharing, while ensuring that the organization's operational needs and productivity goals are met. It is our commitment to fostering a work environment that values employee well-being and recognizes the importance of accommodating\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n"
        }

        txt_policy.text = "Reduced Paperwork: By digitizing policies and guidelines, the app contributes to the university's sustainability efforts by reducing the need for printed materials.\n" +
                "\n" +
                "Improved Compliance: Easy access to policies and guidelines encourages compliance, reducing instances of unintentional rule violations.\n" +
                "\n" +
                "Enhanced Communication: The app facilitates better communication between students, faculty, and administrators, as it serves as a common platform for policy-related information.\n" +
                "\n" +
                "Empowerment: Knowledge is power. The app empowers users by providing them with the information they need to make informed decisions and take appropriate actions.\n" +
                "\n" +
                "Conclusion\n" +
                "\n" +
                "The \"University Policy Hub\" app is a valuable addition to any educational institution, promoting transparency, efficiency, and user empowerment. It streamlines the process of accessing policies and guidelines, making the university experience smoother for everyone involved. By keeping the entire university community well-informed, it contributes to a positive and compliant campus environment.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "User\n" +
                "\n" +
                "2 / 2\n" +
                "\n" +
                "write a brieft statement for a policy\n" +
                "ChatGPT\n" +
                "Policy Title: Flexible Work Arrangements\n" +
                "\n" +
                "Statement:\n" +
                "The Flexible Work Arrangements policy aims to support a diverse and inclusive workplace by providing employees with opportunities to achieve a healthy work-life balance. This policy outlines the guidelines and procedures for requesting and implementing flexible work arrangements, such as telecommuting, flexible hours, or job sharing, while ensuring that the organization's operational needs and productivity goals are met. It is our commitment to fostering a work environment that values employee well-being and recognizes the importance of accommodating\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n"
    }
}
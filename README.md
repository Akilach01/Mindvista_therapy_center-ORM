MindVista - Serenity Mental Health Therapy Center 🧠✨

A comprehensive Mental Health Therapy Management System designed as a coursework project for the ORM module.
The system streamlines the operations of a mental health therapy center by managing users, therapists, patients, therapy programs, scheduling, and payments.

🚀 Features
🔐 User Role Management

Admin
Manages therapists and therapy programs.

Receptionist
Manages patients, schedules therapy sessions, and processes payments.

Authentication & Authorization
Secure login and access control for both roles.

👩‍⚕️ Therapist Management (Admin Only)
Add, update, delete, and view therapist details.
Assign therapists to specific therapy programs.
Track therapist schedules and availability.

📋 Therapy Program Management (Admin Only)
Create, modify, and delete therapy programs.
Define program details: name, duration, cost, description.
Link programs with therapists for scheduling.

🧑‍🤝‍🧑 Patient Management
Add, update, delete, and view patient profiles.
Store medical history and therapy records.

📅 Therapy Session Scheduling
Book appointments for patients.
Assign available therapists automatically based on schedules.
Reschedule or cancel appointments as needed.

💳 Payment & Invoice Management
Process payments for therapy sessions.
Generate and manage invoices for patients.

🛠️ Tech Stack
Java (Core application logic)
Hibernate ORM (Database management with entity mapping)
Servlets & JSP (Presentation and request handling)
Apache Tomcat (Deployment server)
Validation & Custom Exception Handling (Robust input and error management)

📂 Project Structure
Serenity-Mental-Health-Therapy-Center/
├── src/
│   ├── main/java/com/serenity/...
│   │   ├── controller/
│   │   ├── dao/
│   │   ├── entity/
│   │   ├── exception/
│   │   ├── service/
│   │   └── util/
│   └── main/resources/
├── webapp/
│   ├── WEB-INF/
│   ├── jsp/
│   └── static/
├── pom.xml
└── README.md

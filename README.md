# 🤖 AI Chatbot Assistant

This is a full-stack AI-powered chatbot application using **Java Spring Boot** for the backend and **React.js** for the frontend. It integrates with **OpenAI API** to generate intelligent responses based on user input.

---

## 📦 Tech Stack

### 🔹 Backend (Spring Boot)
- Java 17+
- Spring Boot 3.x
- RESTful API
- JPA + H2/MySQL (for storing chat logs)
- OpenAI API Integration

### 🔹 Frontend (React)
- React 18
- Tailwind CSS (optional styling)
- Axios for HTTP calls
- Responsive and modern UI

---

## 🚀 Features

- Ask questions and receive smart answers using OpenAI GPT
- Chat history stored in the backend database
- Neat UI with animated input/output
- Cross-origin enabled for frontend-backend communication

---

## 📁 Project Structure

/backend
├── controller
├── service
├── model
├── repository
└── resources/application.properties

/frontend
├── public/index.html
├── src
├── components
└── App.js


---

## ⚙️ How to Run

### 🖥️ Backend

1. Open the project in your IDE (IntelliJ, Eclipse, VSCode)
2. Make sure you set your OpenAI key in `application.properties`:

### openai.api.key=YOUR_API_KEY
3. Run the Spring Boot main class:


### 🌐 Frontend

1. Go to the `frontend` folder:
2. Install dependencies:
3. Start the React app:


---

## 📄 Environment Variables

| Key             | Location              | Description              |
|----------------|------------------------|--------------------------|
| `OPENAI_API_KEY` | `application.properties` | Your OpenAI API key |

---

## 📷 UI Preview

![Chat UI Preview](![alt text](image.png))

---

## ✅ Future Improvements

- Add authentication
- Export chat as PDF
- Add voice input/output
- Support for multiple languages

---

## 📚 License

This project is licensed under the MIT License.

---

## 🙋‍♂️ Author

Made with ❤️ by [Sameer Khan]





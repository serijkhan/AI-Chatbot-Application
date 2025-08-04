import React, { useState } from 'react';
import './App.css';

function App() {
  const [question, setQuestion] = useState('');
  const [chat, setChat] = useState([]);

  const sendQuestion = async () => {
    if (!question.trim()) return;
    const newChat = [...chat, { role: 'user', message: question }];
    setChat(newChat);
    setQuestion('');
    try {
      const response = await fetch('http://localhost:8082/api/chat', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(question),
      })
    
      const answer = await response.text();
      setChat([...newChat, { role: 'bot', message: answer }]);
    } catch (error) {
      setChat([...newChat, { role: 'bot', message: 'OpenAi Payment is not complete' }]);
    }
  };

  return (
    <div className="container">
      <h1>AI Chatbot</h1>
      <div className="chat-box">
        {chat.map((entry, idx) => (
          <div key={idx} className={`chat-entry ${entry.role}`}>
            <strong>{entry.role === 'user' ? 'You' : 'Bot'}:</strong> {entry.message}
          </div>
        ))}
      </div>
      <div className="input-area">
        <input
          type="text"
          value={question}
          onChange={(e) => setQuestion(e.target.value)}
          placeholder="Ask something..."
        />
        <button onClick={sendQuestion}>Send</button>
      </div>
    </div>
  );
}

export default App;

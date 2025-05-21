import { useState } from "react";

import "./App.css";

function App() {
  const [letter, setLetter] = useState("");
  const [value, setValue] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();
    const counter = await getCorrespondingCitiesCount(value);
    setLetter(counter);
    setValue("");
  };

  const getCorrespondingCitiesCount = async (e) => {
    const citiesNumber = await fetch(`/api/cities/${e}`);
    return await citiesNumber.json();
  };

  return (
    <>
      <h1>HSBC</h1>
      <div className="card">
        <form onSubmit={handleSubmit}>
          <label htmlFor="letter">Enter a letter and press Enter:</label>
          <input
            type="text"
            id="letter"
            name="letter"
            placeholder="Enter a letter and press Enter key"
            pattern="[A-Za-z]"
            maxLength="1"
            value={value}
            onChange={(e) => setValue(e.target.value)}
            required
          />
        </form>
        <p>{letter}</p>
      </div>
    </>
  );
}

export default App;

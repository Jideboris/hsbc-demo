import express, { json } from "express";
import { getCitiesNumber } from "./businessLogicLayers.js";

const app = express();
const PORT = 3000;

// Middleware to parse JSON body
app.use(json());

// Simple GET endpoint
app.get("/api/cities/:letter", getCitiesNumber);

// Start the server
app.listen(PORT, () => {
  console.log(`Server running at http://localhost:${PORT}`);
});

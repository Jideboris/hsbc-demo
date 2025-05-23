# hsbc-demo

The code was written using React frontend and Node backend. I prepared a scaffolding to implement the backend with Java 17+ but could not complete OR test it due issues on my laptop that required time to fix related to JAVA SDK installation, hence I completed the task by using Node.

This task now updated with JAVA backend implementation.

The JAVA backend can be found in the folder server. Both NODE and JAVA implementation can serve the Frontend.

JAVA PORT is 8080
NODE PORT is 3000.

This can be set in the vite.config.js.

The code can be cloned down from git here
git@github.com:Jideboris/hsbc-demo.git
OR https://github.com/Jideboris/hsbc-demo.git

Frontend
cd to hsbc-demo
npm i
npm run dev
Browser here: http://localhost:5173/

Server
cd hsbc-demo
cd node-server
node index.js OR node index
You should see 'Server running at http://localhost:3000'

To build and run the JAVA, 
cd to server
run the command  mvn spring-boot:run

Once running, then run the frontend on PORT 5173.

Note: the frontend is proxy to server using vite.config.js.
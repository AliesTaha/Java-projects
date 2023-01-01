# Java-mini-projects
<div align="center">
  <img src="https://user-images.githubusercontent.com/103478551/208367317-8809a43c-9ab4-4dda-a29e-0f5949fcafff.png" style="width: 700px; height: 500px;">
</div>

These are a collection of programs I wrote in Java. They range from complex sorting algorithms, to databases, to simple games. I have gathered them all in one repository as each program is only one file, and explain what each file does below. 

<h2 id="top">Table of Contents</h2>

* [Technologies used](#technologies)
* [Languages used](#languages)
* [Supported functionality](#functionality)
  + [Dogs](#dogs)
  + [People](#people)
  + [Person](#person)
  + [Login](#login)
  + [Registration](#registration)
  + [Chat](#chat)
* [Installation](#installation)

## Technologies
<p align="center">
<img src="https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB"/> 
<img src="https://img.shields.io/badge/Redux-593D88?style=for-the-badge&logo=redux&logoColor=white"/>
<img src="https://img.shields.io/badge/sqlite-%2307405e.svg?style=for-the-badge&logo=sqlite&logoColor=white"/>
<img src="https://img.shields.io/badge/rails-%23CC0000.svg?style=for-the-badge&logo=ruby-on-rails&logoColor=white"/>
<img src="https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white"/>
</p>
<a href="#top" class="btn">Go back up</a>

## Languages
<p align="center">
<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"/> 
<img src="https://img.shields.io/badge/HTML-239120?style=for-the-badge&logo=html5&logoColor=whit"/>
<img src="https://img.shields.io/badge/CSS-239120?&style=for-the-badge&logo=css3&logoColor=white"/>
<img src="https://img.shields.io/badge/ruby-%23CC342D.svg?style=for-the-badge&logo=ruby&logoColor=white"/>
</p>

## Functionality

#### Dogs
<div align="center">
  <img src="https://user-images.githubusercontent.com/103478551/208367317-8809a43c-9ab4-4dda-a29e-0f5949fcafff.png" style="width: 700px; height: 500px;">
</div>
The feed is created by appending all the dogs in the database, then ordering the posts using the timestamps so that the most recent post in on top.
<hr>

#### People
<div align="center">
  <img src="https://user-images.githubusercontent.com/103478551/208367338-e91d23f9-0477-4357-a1dd-9c33416f11f6.png" style="width: 700px; height: 500px;">
</div>
The feed is created by appending all the users in the database, then ordering the posts using the timestamps so that the most recent post in on top. This shows each user the people they're searching for, whether pet-owners or dog-sitters. 
<hr>

#### Person
<div align="center">
  <img src="https://user-images.githubusercontent.com/103478551/208367344-0c4c3f4a-774a-41a9-930f-c80d3beaf075.png" style="width: 700px; height: 500px;">
</div>
This acts as a profile page, which simply shows the details about the user. This shows if the user is a dog-sitter or has a dog themselves, and information both about the person and the pet. 
<hr>

#### Login
<div align="center">
  <img src="https://user-images.githubusercontent.com/103478551/208367328-e2e7a4a8-08d7-48c3-8560-41b4599c74c3.jpg" style="width: 700px; height: 500px;">
</div>
Logging in simply checks if the user exists in the databse. If so, it checks if the passwords match. If so, then they can move on their own home page. 
Logging out simply clears the memory of the browser such that the user has to log back in, either with the same credentials or a different one. 

<hr>

#### Registration
<div align="center">
  <img src="https://user-images.githubusercontent.com/103478551/208367353-73276e42-dc35-4505-a501-098709e5a4b7.png" style="width: 700px; height: 500px;">
</div>
Signing up adds the new user to the database, and gives them the default profile and background image. It checks to see if passwords match, and checks if the user already exists in the database before doing so. 
<hr>

#### Chat
<div align="center">
  <img src="https://user-images.githubusercontent.com/103478551/208367306-7b17366e-bd8b-407b-9b4f-769ba267f771.jpg" style="width: 700px; height: 500px;">
</div>
The chat is going to be implemented soon, with the goal of allowing users to talk to each other. 
<hr>


## Installation

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

## Available Scripts

In the project directory, you can run:

### `yarn start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

The page will reload when you make changes.\
You may also see any lint errors in the console.

### `yarn test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `yarn build`

Builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `yarn eject`

**Note: this is a one-way operation. Once you `eject`, you can't go back!**

If you aren't satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you're on your own.

You don't have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn't feel obligated to use this feature. However we understand that this tool wouldn't be useful if you couldn't customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: [https://facebook.github.io/create-react-app/docs/code-splitting](https://facebook.github.io/create-react-app/docs/code-splitting)

### Analyzing the Bundle Size

This section has moved here: [https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size](https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size)

### Making a Progressive Web App

This section has moved here: [https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app](https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app)

### Advanced Configuration

This section has moved here: [https://facebook.github.io/create-react-app/docs/advanced-configuration](https://facebook.github.io/create-react-app/docs/advanced-configuration)

### Deployment

This section has moved here: [https://facebook.github.io/create-react-app/docs/deployment](https://facebook.github.io/create-react-app/docs/deployment)

### `yarn build` fails to minify

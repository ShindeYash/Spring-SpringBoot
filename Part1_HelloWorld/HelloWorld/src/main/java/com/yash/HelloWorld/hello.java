package com.yash.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    
    // Home Page
    @RequestMapping("/")
    public String home() {
        return """
               <html>
                   <head>
                       <title>Home - Charitable Website</title>
                   </head>
                   <body>
                       <h1>Welcome to Our Charitable Website</h1>
                       <nav>
                           <a href="/about">About Us</a> |
                           <a href="/donate">Donate</a> |
                           <a href="/contact">Contact</a>
                       </nav>
                       <p>We strive to make the world a better place!</p>
                   </body>
               </html>
               """;
    }

    // About Us Page
    @RequestMapping("/about")
    public String about() {
        return """
               <html>
                   <head>
                       <title>About Us - Charitable Website</title>
                   </head>
                   <body>
                       <h1>About Us</h1>
                       <nav>
                           <a href="/">Home</a> |
                           <a href="/donate">Donate</a> |
                           <a href="/contact">Contact</a>
                       </nav>
                       <p>We are a nonprofit organization dedicated to helping communities in need. 
                          Join us in making a difference!</p>
                   </body>
               </html>
               """;
    }

    // Donate Page
    @RequestMapping("/donate")
    public String donate() {
        return """
               <html>
                   <head>
                       <title>Donate - Charitable Website</title>
                   </head>
                   <body>
                       <h1>Donate</h1>
                       <nav>
                           <a href="/">Home</a> |
                           <a href="/about">About Us</a> |
                           <a href="/contact">Contact</a>
                       </nav>
                       <p>Your contributions make a difference! Click below to donate:</p>
                       <button onclick="alert('Thank you for your generosity!')">Donate Now</button>
                   </body>
               </html>
               """;
    }

    // Contact Page
    @RequestMapping("/contact")
    public String contact() {
        return """
               <html>
                   <head>
                       <title>Contact - Charitable Website</title>
                   </head>
                   <body>
                       <h1>Contact Us</h1>
                       <nav>
                           <a href="/">Home</a> |
                           <a href="/about">About Us</a> |
                           <a href="/donate">Donate</a>
                       </nav>
                       <p>Have questions? Reach out to us at:</p>
                       <p>Email: contact@charity.org</p>
                       <p>Phone: +123 456 7890</p>
                   </body>
               </html>
               """;
    }
}







































// package com.yash.HelloWorld;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// @RestController
// public class hello {
//     @RequestMapping ("/")
//     public String greet(){
//         return """
//         <!DOCTYPE html>
// <html lang="en">
// <head>
//     <meta charset="UTF-8">
//     <meta name="viewport" content="width=device-width, initial-scale=1.0">
//     <title>Charity for Change</title>
//     <style>
//         * {
//             margin: 0;
//             padding: 0;
//             box-sizing: border-box;
//             font-family: Arial, sans-serif;
//         }
//         body {
//             line-height: 1.6;
//         }
//         header {
//             background: linear-gradient(to right, #6a11cb, #2575fc);
//             color: white;
//             padding: 20px;
//             text-align: center;
//         }
//         header h1 {
//             font-size: 2.5em;
//             margin-bottom: 10px;
//         }
//         header p {
//             font-size: 1.2em;
//         }
//         nav {
//             display: flex;
//             justify-content: center;
//             background: #fff;
//             padding: 10px 0;
//             box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
//         }
//         nav a {
//             margin: 0 15px;
//             text-decoration: none;
//             color: #333;
//             font-weight: bold;
//         }
//         nav a:hover {
//             color: #6a11cb;
//         }
//         .hero {
//             background: url('https://via.placeholder.com/1500x500') no-repeat center center/cover;
//             color: white;
//             height: 60vh;
//             display: flex;
//             justify-content: center;
//             align-items: center;
//             text-align: center;
//         }
//         .hero h2 {
//             font-size: 2.5em;
//             margin-bottom: 20px;
//             text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
//         }
//         .hero a {
//             text-decoration: none;
//             background: #ff6b6b;
//             color: white;
//             padding: 15px 30px;
//             border-radius: 25px;
//             font-size: 1.2em;
//             transition: background 0.3s ease;
//         }
//         .hero a:hover {
//             background: #ff4d4d;
//         }
//         .about, .donate {
//             padding: 50px 20px;
//             text-align: center;
//         }
//         .about h2, .donate h2 {
//             font-size: 2em;
//             margin-bottom: 20px;
//             color: #333;
//         }
//         .about p, .donate p {
//             font-size: 1.1em;
//             margin-bottom: 20px;
//             color: #555;
//         }
//         .donate button {
//             background: #6a11cb;
//             color: white;
//             border: none;
//             padding: 15px 30px;
//             font-size: 1.2em;
//             border-radius: 25px;
//             cursor: pointer;
//             transition: background 0.3s ease;
//         }
//         .donate button:hover {
//             background: #2575fc;
//         }
//         footer {
//             background: #333;
//             color: white;
//             padding: 20px 0;
//             text-align: center;
//         }
//         footer p {
//             margin-bottom: 10px;
//         }
//         footer .social-icons a {
//             color: white;
//             margin: 0 10px;
//             font-size: 1.5em;
//             text-decoration: none;
//         }
//         footer .social-icons a:hover {
//             color: #6a11cb;
//         }
//     </style>
// </head>
// <body>
//     <header>
//         <h1>Charity for Change</h1>
//         <p>Making the world a better place, one step at a time.</p>
//     </header>
//     <nav>
//         <a href="#about">About Us</a>
//         <a href="#donate">Donate</a>
//         <a href="#contact">Contact</a>
//     </nav>
//     <section class="hero">
//         <div>
//             <h2>Be the Change You Wish to See</h2>
//             <a href="#donate">Donate Now</a>
//         </div>
//     </section>
//     <section id="about" class="about">
//         <h2>Our Mission</h2>
//         <p>
//             At Charity for Change, we aim to support underprivileged communities by providing access to
//             education, healthcare, and essential resources. Together, we can make a difference.
//         </p>
//     </section>
//     <section id="donate" class="donate">
//         <h2>Make a Donation</h2>
//         <p>Your contribution helps us bring hope and change to those in need. Every small act counts!</p>
//         <button onclick="alert('Thank you for your support!')">Donate Now</button>
//     </section>
//     <footer id="contact">
//         <p>Contact us: info@charityforchange.org | +1 800 123 4567</p>
//         <div class="social-icons">
//             <a href="#"><i class="fa fa-facebook"></i></a>
//             <a href="#"><i class="fa fa-twitter"></i></a>
//             <a href="#"><i class="fa fa-instagram"></i></a>
//         </div>
//         <p>&copy; 2024 Charity for Change. All rights reserved.</p>
//     </footer>
// </body>
// </html>
//                """;
//     }
// }
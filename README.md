# CarManager App

## Description

Spring REST API to manage user's vehicles

It was part of the challenge from the Orange Talents program from Zup

https://www.zup.com.br/orange-talents

This API consists of 3 end-points: to register users and their vehicles, to list the user's vehicles

It also defines the 'no driving day' based on the year of the vehicle 
and consumes an external API to bring the price of it too.

## Index
<p align="center"> - 
 <a href="#status">Status</a> - 
 <a href="#features">Features</a> - 
 <a href="#requirements">Requirements</a> - 
 <a href="#running">Running</a> - 
 <a href="#technologies">Technologies</a> - 
 <a href="#author">Author</a> - 
 <a href="#license">License</a> - 
</p>

## Status 

Finished

## Features

- [x] Create User
- [x] Create Vehicle
- [x] List User's Vehicles
- [x] Cosumes FIPE API

## Requirements

### Tools

- [Git](https://git-scm.com)
- [Java 8](https://www.java.com/en/)
- [Insomnia](https://insomnia.rest/)

It's possible to use Postman or other app to do the client-side 

### Dependencies

All you basically need is in Spring,
you should be able to find them in the pom.xml file

### Clone the repository

<code> $ git clone <https://github.com/vinidesenvolve/OrangeTalents.git> </code>

## Running

Make sure you got MySQL running and the connection is correctly configured
in application.properties, things such as port, root and password.

After that use Spring boot dashboard to kick start the applicantion.

Use your client side app and have fun!

## Technologies

- [Java 8]
- [Spring Web MVC]
- [Spring Validation]
- [Spring Devtools]
- [Spring DataJPA]
- [Spring Cloud Open Feign]
- [Lombok]
- [MySQL]

## Author

<p> <a href="https://github.com/vinidesenvolve">Vinicius Alves Rodrigues</a> </p>
<p> <a href="https://www.linkedin.com/in/vinidesenvolve/">Likedin</a> </p>
<p> <a href="vinidesenvolve@gmail.com">Email</a> </p>

## License

<p align="center">
MIT License

Copyright (c) 2021 Vinicius A. Rodrigues

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
</p>

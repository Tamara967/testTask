

Basic Selenium Project
===================================

This scaffold project is written in **[Java](https://www.java.com/)** and will serve an example of implementing a
Selenium test project with [Maven] and [Junit].
Everything is set up and tests can be added straight away.
_Since Maven has an excellent **Java** interop it's perfectly fine to write your Tests in Java if you want, it will work out of the box._
To execute the tests just browse to the path the file HomePageTest   execute the tests in your IDE.
The Project will use Chrome Browser in Headless mode by default .




### Prerequisites
* \>=**JDK8** installed
* \>=**selenium-java(4.1.4)** installed
* \>=**junit** installed

#### Features:
* * [full control by annotations](#-full-control-over-certain-test-methods-and-classes-by-annotations)
* [page object pattern ready](#-page-object-pattern-ready)
* [take screenshot on test failure](#-take-screenshots)
* [highlight clicked elements](#-highlight-clicked-elements)
* [centralized project config](#-centralized-project-config)
* assertions, waits and test extensions
  * [assertions with selenium specific and type safe matchers](#-assertions)
  * [waiting functions](#-waits)

## Benefits

#### 💻 Implemented Browsers
#### 💻 Implemented Browsers
Thanks to the awesome [webdrivermanager](https://github.com/bonigarcia/webdrivermanager) it supports the following browsers and automatically downloads OS specific binaries for:
* Chrome Headless (default) `./gradlew clean test`
---

#### 🕹️ Full control over certain test methods and classes by annotations
The project includes custom annotations to comfortably set some test conditions and/or assumptions


##### @EnabledOnOs
You can control that a test will ONLY be executed on specific operating systems.
(works on class and method level)

    @EnabledOnOs(LINUX, WINDOWS)


##### @DisabledOnJre
You can control that a test will be skipped if running on specific JRE(s).

    @DisabledOnJre(JAVA_8, JAVA_9)

##### @EnabledIfSystemProperty
Gives control over test execution relying on system properties. The following example will execute the test only
if the current OS is a 64bit system. But it could be any either provided or self defined system property.

    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")

If a test is annotated with `@EnabledIfSystemProperty` it will ONLY be executed if the specified system property (field `named`)
will match the provided regex (field `matches`), otherwise the test will be skipped.



#### 📸 Take Screenshots
To compare results screenshots will automatically be taken and stored under `resources\Images`.
The screenshot files will be named with a combination of the class name and current date.
---



#### 🎯 Centralized Project Config
All global configurations are living in a properties file (`resources/Configs/configFile.properties`) and can be adjusted.
---





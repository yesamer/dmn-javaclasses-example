# DMN Type from Java Classes

## Description
This project demonstrates how to import Java Classes as DMN Type in your DMN files.
For a comprehensive description, please refer to this blog post: https://blog.kie.org/2022/05/dmn-types-from-java-classes.html

##Required tools
- VSCode;
- KIE Kogito Bundle or KIE Business Automation Bundle or DMN Editor plugin (0.30.0+);
- Language Support for Java(TM) by Red Hat (1.19.0+);
- The Activator, a Java class file (Activator.java) required to activate the functionality. Please use that exact name for the Activator.
- Your domain’s Java Beans;

## Updates
05-31-2023: `@KieActivator` annotation is no longer required. Please make sure your Activator file name is exactely "Activator.java"
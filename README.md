# DMN Type from Java Classes

## Description
This project demonstrates how to import Java Classes as DMN Type in your DMN files.
For a comprehensive description, please refer to this blog post: https://blog.kie.org/2022/05/dmn-types-from-java-classes.html

##Required tools
- VSCode 1.66+;
- [Apache KIE™ Kogito Bundle](https://marketplace.visualstudio.com/items?itemName=kie-group.vscode-extension-kogito-bundle) or [Apache KIE™ Kogito Bundle](https://marketplace.visualstudio.com/items?itemName=kie-group.vscode-extension-kie-ba-bundle) or [Apache KIE™ DMN Editor](https://marketplace.visualstudio.com/items?itemName=kie-group.dmn-vscode-extension) version 10.0.0
- [Language Support for Java(TM) by Red Hat](https://marketplace.visualstudio.com/items?itemName=redhat.java) (1.31.0+);
- The Activator, a Java class file (Activator.java) required to activate the functionality. Please use that exact name for the Activator.
- Your domain’s Java Beans;

## Updates
- 01-23-2025: Updated to Apache KIE 10.0.0
- 12-06-2024: README updated.
- 06-22-2023: Updated to Kogito 1.40.0.Final version
- 05-31-2023: `@KieActivator` annotation is no longer required. Please make sure your Activator file name is exactely "Activator.java"
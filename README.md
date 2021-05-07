# How To Integrate Angular Elements Into GWT Apps
This is an example project showcasing how we can include complete Angular Elements applications inside GWT apps.

The point of doing this is to allow teams that are stuck with legacy GWT apps to use Angular in newer modules. Converting whole apps into Angular can be an expensive endeavor, but creating only the key modules can improve our apps and keep it modern. By using Angular Elements, we can create apps that can be included into other frameworks, allowing us to use modern apps in our legacy projects.

The integration part is implemented in the RepairWidget class.
- It has all the methods to control the repair widget.
- It's using the repair-widget.js (Angular Element app) from RepairWidgetResources

The Angular app is using the script elements-build.js to create a single Javascript file that can be used in other apps.

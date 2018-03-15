package hu.csega.toolshed.framework.components;

import hu.csega.toolshed.framework.ToolWindow;
import hu.csega.toolshed.framework.impl.AbstractTool;

public class ToolComponent {

       private AbstractTool tool;
       
       public ToolComponent(AbstractTool tool) {
               this.tool = tool;
       }
       
       protected <T> T getComponent(Class<T> componentClass) {
               return tool.getComponent(componentClass);
       }
       
       
       protected <T> T getComponent(String name, Class<T> componentClass) {
               return tool.getComponent(name, componentClass);
       }
       
       public ToolWindow getWindow() {
               return tool.getWindow();
       }
       
       public AbstractTool getTool() {
               return tool;
       }
       
}

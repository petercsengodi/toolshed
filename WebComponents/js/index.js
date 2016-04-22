var renderComponent = function(parent, component) {
    if(component.tag === "undefined" && component.html !== undefined) {
        parent.write(component.html);
    }
    
    var tag = document.createElement(component.tag);
    
    if(component.tag === "form") {
        tag.action = component.action;
        tag.method = component.method;
    }
    
    if(component.tag === "input" || component.tag === "select") {
        if(component.label !== undefined) {
            var t = document.createElement("label");
            var t2 = document.createTextNode(component.label + ":");
            t.appendChild(t2);
            parent.appendChild(t);
        }
        
        if(component.type !== undefined)
            tag.type = component.type;
        
        if(component.target !== undefined)
            tag.target = component.target;
        
        tag.name = component.name;
        if(component.value !== undefined)
            tag.value = component.value;
    }
 
    if(component.tag === "button") {
        if(component.type !== undefined)
            tag.type = component.type;
        
        if(component.value !== undefined)
            tag.value = component.value;

        if(component.name !== undefined)
            tag.name = component.name;
    }
    
    if(component.tag === "a") {
        tag.href = component.href;
        if(component.target !== undefined)
            tag.target = component.target;
    }
    
    if(component.tag === "select") {
        for (var index in component.options) {
            var option = component.options[index];
            var o = document.createElement("option");
            o.value = option.value;
            if(component.value !== undefined && option.value == component.value)
                o.selected = "selected";
            var l = document.createTextNode(option.label);
            o.appendChild(l);
            tag.appendChild(o);
        }        
    }
    
    if(component.html !== undefined)
        tag.innerHTML = component.html;
    
    if(component.text !== undefined) {
        var t = document.createTextNode(component.text);
        tag.appendChild(t);
    }
    
    if(component.children != undefined) {
        for (var index in component.children) {
            var child = component.children[index];
            
            if(component.tag !== undefined) {
                renderComponent(tag, child);
            }
        }
    }
    
    parent.appendChild(tag);
}

var webComponents = function(components) {
    
    var body = document.getElementById("body");
    
    for (var index in components) {
        var component = components[index];

        if(component.tag !== undefined) {
         
            renderComponent(body, component);
            
        }
    }
}
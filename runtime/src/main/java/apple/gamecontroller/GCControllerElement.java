package apple.gamecontroller;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;





@Library("GameController") @Mapping("GCControllerElement")
public class GCControllerElement 
    extends NSObject 
     {

    
    
    public GCControllerElement() {}
    
    
    @Mapping("collection")
    public native GCControllerElement getCollection();
    @Mapping("isAnalog")
    public native boolean isAnalog();
    
    
    
    
    
}

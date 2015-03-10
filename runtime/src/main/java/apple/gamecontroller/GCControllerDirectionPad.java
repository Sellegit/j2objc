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





@Library("GameController") @Mapping("GCControllerDirectionPad")
public class GCControllerDirectionPad 
    extends GCControllerElement 
     {

    
    
    public GCControllerDirectionPad() {}
    
    
    @Mapping("valueChangedHandler")
    public native @Block VoidBlock3<GCControllerDirectionPad, Float, Float> getValueChangedHandler();
    public native void setValueChangedHandler(@Block VoidBlock3<GCControllerDirectionPad, Float, Float> v);
    @Mapping("xAxis")
    public native GCControllerAxisInput getXAxis();
    @Mapping("yAxis")
    public native GCControllerAxisInput getYAxis();
    @Mapping("up")
    public native GCControllerButtonInput getUp();
    @Mapping("down")
    public native GCControllerButtonInput getDown();
    @Mapping("left")
    public native GCControllerButtonInput getLeft();
    @Mapping("right")
    public native GCControllerButtonInput getRight();
    
    
    
    
    
}

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





@Library("GameController") @Mapping("GCControllerAxisInput")
public class GCControllerAxisInput 
    extends GCControllerElement 
     {

    
    
    public GCControllerAxisInput() {}
    
    
    @Mapping("valueChangedHandler")
    public native @Block VoidBlock2<GCControllerAxisInput, Float> getValueChangedHandler();
    @Mapping("setValueChangedHandler:")
    public native void setValueChangedHandler(@Block VoidBlock2<GCControllerAxisInput, Float> v);
    @Mapping("value")
    public native float getValue();
    
    
    
    
    
}

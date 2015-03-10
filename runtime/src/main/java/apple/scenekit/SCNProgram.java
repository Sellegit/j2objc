package apple.scenekit;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.dispatch.*;
import apple.glkit.*;
import apple.spritekit.*;
import apple.opengles.*;





@Library("SceneKit") @Mapping("SCNProgram")
public class SCNProgram 
    extends NSObject 
    implements NSCopying {

    
    
    public SCNProgram() {}
    
    
    @Mapping("vertexShader")
    public native String getVertexShader();
    public native void setVertexShader(String v);
    @Mapping("fragmentShader")
    public native String getFragmentShader();
    public native void setFragmentShader(String v);
    @Mapping("isOpaque")
    public native boolean isOpaque();
    public native void setOpaque(boolean v);
    @Mapping("delegate")
    public native SCNProgramDelegate getDelegate();
    public native void setDelegate(SCNProgramDelegate v);
    
    
    
    @Mapping("setSemantic:forSymbol:options:")
    public native void setSemanticForSymbol(String semantic, String symbol, SCNProgramSemanticOptions options);
    @Mapping("semanticForSymbol:")
    public native String getSemanticForSymbol(String symbol);
    @Mapping("program")
    public static native SCNProgram create();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}

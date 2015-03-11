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





@Library("SceneKit") @Mapping("SCNShadable")
public interface SCNShadable 
    extends NSObjectProtocol {

    
    
    @Mapping("shaderModifiers")
    Map<SCNShaderModifierEntryPoint, String> getShaderModifiers();
    @Mapping("setShaderModifiers:")
    void setShaderModifiers(Map<SCNShaderModifierEntryPoint, String> v);
    @Mapping("program")
    SCNProgram getProgram();
    @Mapping("setProgram:")
    void setProgram(SCNProgram v);
    
    
    @Mapping("handleBindingOfSymbol:usingBlock:")
    void handleBindingOfSymbol(String symbol, @Block VoidBlock4<Integer, Integer, SCNNode, SCNRenderer> block);
    @Mapping("handleUnbindingOfSymbol:usingBlock:")
    void handleUnbindingOfSymbol(String symbol, @Block VoidBlock4<Integer, Integer, SCNNode, SCNRenderer> block);
    
    /*<adapter>*/
    /*</adapter>*/
}

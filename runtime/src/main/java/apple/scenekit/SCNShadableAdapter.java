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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class SCNShadableAdapter 
    extends Object 
    implements SCNShadable {

    
    
    
    @NotImplemented("shaderModifiers")
    public Map<SCNShaderModifierEntryPoint, String> getShaderModifiers() { throw new UnsupportedOperationException(); }
    @Mapping("setShaderModifiers:")
    public void setShaderModifiers(Map<SCNShaderModifierEntryPoint, String> v) { throw new UnsupportedOperationException(); }
    @NotImplemented("program")
    public SCNProgram getProgram() { throw new UnsupportedOperationException(); }
    @Mapping("setProgram:")
    public void setProgram(SCNProgram v) { throw new UnsupportedOperationException(); }
    
    
    
    @NotImplemented("handleBindingOfSymbol:usingBlock:")
    public void handleBindingOfSymbol(String symbol, @Block VoidBlock4<Integer, Integer, SCNNode, SCNRenderer> block) { throw new UnsupportedOperationException(); }
    @NotImplemented("handleUnbindingOfSymbol:usingBlock:")
    public void handleUnbindingOfSymbol(String symbol, @Block VoidBlock4<Integer, Integer, SCNNode, SCNRenderer> block) { throw new UnsupportedOperationException(); }
    
}

package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;
import apple.metal.*;





@Library("QuartzCore") @Mapping("CATiledLayer")
public class CATiledLayer 
    extends CALayer 
     {

    
    
    public CATiledLayer() {}
    @Mapping("initWithLayer:")
    public CATiledLayer(Object layer) { }
    
    
    @Mapping("levelsOfDetail")
    public native @MachineSizedUInt long getLevelsOfDetail();
    @Mapping("setLevelsOfDetail:")
    public native void setLevelsOfDetail(@MachineSizedUInt long v);
    @Mapping("levelsOfDetailBias")
    public native @MachineSizedUInt long getLevelsOfDetailBias();
    @Mapping("setLevelsOfDetailBias:")
    public native void setLevelsOfDetailBias(@MachineSizedUInt long v);
    @Mapping("tileSize")
    public native CGSize getTileSize();
    @Mapping("setTileSize:")
    public native void setTileSize(CGSize v);
    
    
    
    @Mapping("fadeDuration")
    public static native double getFadeDuration();
    
}

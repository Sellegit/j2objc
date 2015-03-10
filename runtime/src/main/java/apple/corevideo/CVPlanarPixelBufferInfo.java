package apple.corevideo;


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
import apple.opengles.*;
import apple.coremedia.*;
import apple.metal.*;





@Mapping("CVPlanarPixelBufferInfo")
public class CVPlanarPixelBufferInfo 
    extends Struct 
     {

    
    protected CVPlanarPixelBufferInfo() {}
    
    
    @DotMapping("componentInfo")
    public native CVPlanarComponentInfo getComponentInfo();
    
    public static native CVPlanarPixelBufferInfo create(CVPlanarComponentInfo componentInfo) /*-[
        CVPlanarPixelBufferInfo __new = { .componentInfo = componentInfo };
        return __new;
    ]-*/;
    public static native CVPlanarPixelBufferInfo copyWithcomponentInfo(CVPlanarPixelBufferInfo original, CVPlanarComponentInfo componentInfo) /*-[
        original.componentInfo = componentInfo;
        return __new;
    ]-*/;

    
}

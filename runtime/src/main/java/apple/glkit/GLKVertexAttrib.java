package apple.glkit;


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
import apple.uikit.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("GLKit")
@Mapping("GLKVertexAttrib")
public final class GLKVertexAttrib extends ObjCEnum {
    
    @GlobalConstant("GLKVertexAttribPosition")
    public static final long Position = 0L;
    @GlobalConstant("GLKVertexAttribNormal")
    public static final long Normal = 1L;
    @GlobalConstant("GLKVertexAttribColor")
    public static final long Color = 2L;
    @GlobalConstant("GLKVertexAttribTexCoord0")
    public static final long TexCoord0 = 3L;
    @GlobalConstant("GLKVertexAttribTexCoord1")
    public static final long TexCoord1 = 4L;
    

}

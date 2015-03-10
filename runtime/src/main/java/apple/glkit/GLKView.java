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

@Library("GLKit") @Mapping("GLKView")
public class GLKView 
    extends UIView 
    implements NSCoding {

    
    
    public GLKView() {}
    @Mapping("initWithFrame:context:")
    public GLKView(CGRect frame, EAGLContext context) { }
    @Mapping("initWithFrame:")
    public GLKView(CGRect frame) { }
    
    
    @Mapping("delegate")
    public native GLKViewDelegate getDelegate();
    public native void setDelegate(GLKViewDelegate v);
    @Mapping("context")
    public native EAGLContext getContext();
    public native void setContext(EAGLContext v);
    @Mapping("drawableWidth")
    public native @MachineSizedSInt long getDrawableWidth();
    @Mapping("drawableHeight")
    public native @MachineSizedSInt long getDrawableHeight();
    @Mapping("drawableColorFormat")
    public native @Representing("GLKViewDrawableColorFormat") int getDrawableColorFormat();
    public native void setDrawableColorFormat(@Representing("GLKViewDrawableColorFormat") int v);
    @Mapping("drawableDepthFormat")
    public native @Representing("GLKViewDrawableDepthFormat") int getDrawableDepthFormat();
    public native void setDrawableDepthFormat(@Representing("GLKViewDrawableDepthFormat") int v);
    @Mapping("drawableStencilFormat")
    public native @Representing("GLKViewDrawableStencilFormat") int getDrawableStencilFormat();
    public native void setDrawableStencilFormat(@Representing("GLKViewDrawableStencilFormat") int v);
    @Mapping("drawableMultisample")
    public native @Representing("GLKViewDrawableMultisample") int getDrawableMultisample();
    public native void setDrawableMultisample(@Representing("GLKViewDrawableMultisample") int v);
    @Mapping("snapshot")
    public native UIImage getSnapshot();
    @Mapping("enableSetNeedsDisplay")
    public native boolean enablesSetNeedsDisplay();
    public native void setEnablesSetNeedsDisplay(boolean v);
    
    
    
    @Mapping("bindDrawable")
    public native void bindDrawable();
    @Mapping("deleteDrawable")
    public native void deleteDrawable();
    @Mapping("display")
    public native void display();
    
}

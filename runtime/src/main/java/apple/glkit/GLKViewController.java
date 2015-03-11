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

@Library("GLKit") @Mapping("GLKViewController")
public class GLKViewController 
    extends UIViewController 
    implements NSCoding, GLKViewDelegate {

    
    
    public GLKViewController() {}
    @Mapping("initWithNibName:bundle:")
    public GLKViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("delegate")
    public native GLKViewControllerDelegate getDelegate();
    public native void setDelegate(GLKViewControllerDelegate v);
    @Mapping("preferredFramesPerSecond")
    public native @MachineSizedSInt long getPreferredFramesPerSecond();
    public native void setPreferredFramesPerSecond(@MachineSizedSInt long v);
    @Mapping("framesPerSecond")
    public native @MachineSizedSInt long getFramesPerSecond();
    @Mapping("isPaused")
    public native boolean isPaused();
    public native void setPaused(boolean v);
    @Mapping("framesDisplayed")
    public native @MachineSizedSInt long getFramesDisplayed();
    @Mapping("timeSinceFirstResume")
    public native double getTimeSinceFirstResume();
    @Mapping("timeSinceLastResume")
    public native double getTimeSinceLastResume();
    @Mapping("timeSinceLastUpdate")
    public native double getTimeSinceLastUpdate();
    @Mapping("timeSinceLastDraw")
    public native double getTimeSinceLastDraw();
    @Mapping("pauseOnWillResignActive")
    public native boolean pausesOnWillResignActive();
    public native void setPausesOnWillResignActive(boolean v);
    @Mapping("resumeOnDidBecomeActive")
    public native boolean resumesOnDidBecomeActive();
    public native void setResumesOnDidBecomeActive(boolean v);
    
    
    
    @Mapping("glkView:drawInRect:")
    public native void draw(GLKView view, CGRect rect);
    
}

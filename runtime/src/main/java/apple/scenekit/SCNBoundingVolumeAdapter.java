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
public abstract class SCNBoundingVolumeAdapter 
    extends Object 
    implements SCNBoundingVolume {

    
    
    


    
    
    @NotImplemented("getBoundingBoxMin:max:")
    public boolean getBoundingBox(SCNVector3 min, SCNVector3 max) { throw new UnsupportedOperationException(); }
    @NotImplemented("getBoundingSphereCenter:radius:")
    public boolean getBoundingSphere(SCNVector3 center, Todo radius) { throw new UnsupportedOperationException(); }
    @NotImplemented("setBoundingBoxMin:max:")
    public void setBoundingBox(SCNVector3 min, SCNVector3 max) { throw new UnsupportedOperationException(); }

}

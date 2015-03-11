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

public abstract class SCNAnimatableAdapter 
    extends Object 
    implements SCNAnimatable {

    
    
    
    
    
    
    
    @NotImplemented("addAnimation:forKey:")
    public void addAnimation(CAAnimation animation, String key) { throw new UnsupportedOperationException(); }
    @NotImplemented("removeAllAnimations")
    public void removeAllAnimations() { throw new UnsupportedOperationException(); }
    @NotImplemented("removeAnimationForKey:")
    public void removeAnimation(String key) { throw new UnsupportedOperationException(); }
    @NotImplemented("animationKeys")
    public List<String> getAnimationKeys() { throw new UnsupportedOperationException(); }
    @NotImplemented("animationForKey:")
    public CAAnimation getAnimation(String key) { throw new UnsupportedOperationException(); }
    @NotImplemented("pauseAnimationForKey:")
    public void pauseAnimation(String key) { throw new UnsupportedOperationException(); }
    @NotImplemented("resumeAnimationForKey:")
    public void resumeAnimation(String key) { throw new UnsupportedOperationException(); }
    @NotImplemented("isAnimationForKeyPaused:")
    public boolean isAnimationPaused(String key) { throw new UnsupportedOperationException(); }
    @NotImplemented("removeAnimationForKey:fadeOutDuration:")
    public void removeAnimation(String key, @MachineSizedFloat double duration) { throw new UnsupportedOperationException(); }
    
}

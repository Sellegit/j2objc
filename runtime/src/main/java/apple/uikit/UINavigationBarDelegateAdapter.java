package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UINavigationBarDelegateAdapter 
    extends UIBarPositioningDelegateAdapter 
    implements UINavigationBarDelegate {

    
    
    


    
    
    @NotImplemented("navigationBar:shouldPushItem:")
    public boolean shouldPushItem(UINavigationBar navigationBar, UINavigationItem item) { throw new UnsupportedOperationException(); }
    @NotImplemented("navigationBar:didPushItem:")
    public void didPushItem(UINavigationBar navigationBar, UINavigationItem item) { throw new UnsupportedOperationException(); }
    @NotImplemented("navigationBar:shouldPopItem:")
    public boolean shouldPopItem(UINavigationBar navigationBar, UINavigationItem item) { throw new UnsupportedOperationException(); }
    @NotImplemented("navigationBar:didPopItem:")
    public void didPopItem(UINavigationBar navigationBar, UINavigationItem item) { throw new UnsupportedOperationException(); }

}

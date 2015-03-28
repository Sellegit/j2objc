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
public abstract class UIAdaptivePresentationControllerDelegateAdapter 
    extends Object 
    implements UIAdaptivePresentationControllerDelegate {

    
    
    


    
    
    @NotImplemented("adaptivePresentationStyleForPresentationController:")
    public @Representing("UIModalPresentationStyle") long getAdaptivePresentationStyle(UIPresentationController controller) { throw new UnsupportedOperationException(); }
    @NotImplemented("presentationController:viewControllerForAdaptivePresentationStyle:")
    public UIViewController getViewController(UIPresentationController controller, @Representing("UIModalPresentationStyle") long style) { throw new UnsupportedOperationException(); }

}

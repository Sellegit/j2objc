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
public abstract class UIPageViewControllerDataSourceAdapter 
    extends Object 
    implements UIPageViewControllerDataSource {

    
    
    
    
    
    
    
    @NotImplemented("pageViewController:viewControllerBeforeViewController:")
    public UIViewController getViewControllerBefore(UIPageViewController pageViewController, UIViewController viewController) { throw new UnsupportedOperationException(); }
    @NotImplemented("pageViewController:viewControllerAfterViewController:")
    public UIViewController getViewControllerAfter(UIPageViewController pageViewController, UIViewController viewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("presentationCountForPageViewController:")
    public @MachineSizedSInt long getPresentationCount(UIPageViewController pageViewController) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("presentationIndexForPageViewController:")
    public @MachineSizedSInt long getPresentationIndex(UIPageViewController pageViewController) { throw new UnsupportedOperationException(); }
    
}

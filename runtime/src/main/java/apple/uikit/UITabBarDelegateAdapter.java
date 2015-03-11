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
public abstract class UITabBarDelegateAdapter 
    extends Object 
    implements UITabBarDelegate {

    
    
    
    
    
    
    
    @NotImplemented("tabBar:didSelectItem:")
    public void didSelectItem(UITabBar tabBar, UITabBarItem item) { throw new UnsupportedOperationException(); }
    @NotImplemented("tabBar:willBeginCustomizingItems:")
    public void willBeginCustomizingItems(UITabBar tabBar, NSArray<UITabBarItem> items) { throw new UnsupportedOperationException(); }
    @NotImplemented("tabBar:didBeginCustomizingItems:")
    public void didBeginCustomizingItems(UITabBar tabBar, NSArray<UITabBarItem> items) { throw new UnsupportedOperationException(); }
    @NotImplemented("tabBar:willEndCustomizingItems:changed:")
    public void willEndCustomizingItems(UITabBar tabBar, NSArray<UITabBarItem> items, boolean changed) { throw new UnsupportedOperationException(); }
    @NotImplemented("tabBar:didEndCustomizingItems:changed:")
    public void didEndCustomizingItems(UITabBar tabBar, NSArray<UITabBarItem> items, boolean changed) { throw new UnsupportedOperationException(); }
    
}

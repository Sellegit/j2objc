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


@Library("UIKit/UIKit.h") @Mapping("UITabBarDelegate")
public interface UITabBarDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("tabBar:didSelectItem:")
    void didSelectItem(UITabBar tabBar, UITabBarItem item);
    @Mapping("tabBar:willBeginCustomizingItems:")
    void willBeginCustomizingItems(UITabBar tabBar, NSArray<?> items);
    @Mapping("tabBar:didBeginCustomizingItems:")
    void didBeginCustomizingItems(UITabBar tabBar, NSArray<?> items);
    @Mapping("tabBar:willEndCustomizingItems:changed:")
    void willEndCustomizingItems(UITabBar tabBar, NSArray<?> items, boolean changed);
    @Mapping("tabBar:didEndCustomizingItems:changed:")
    void didEndCustomizingItems(UITabBar tabBar, NSArray<?> items, boolean changed);

    /*<adapter>*/
    /*</adapter>*/
}

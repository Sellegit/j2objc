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





@Library("UIKit") @Mapping("UISearchControllerDelegate")
public interface UISearchControllerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("willPresentSearchController:")
    void willPresent(UISearchController searchController);
    @Mapping("didPresentSearchController:")
    void didPresent(UISearchController searchController);
    @Mapping("willDismissSearchController:")
    void willDismiss(UISearchController searchController);
    @Mapping("didDismissSearchController:")
    void didDismiss(UISearchController searchController);
    @Mapping("presentSearchController:")
    void present(UISearchController searchController);
    
    /*<adapter>*/
    /*</adapter>*/
}

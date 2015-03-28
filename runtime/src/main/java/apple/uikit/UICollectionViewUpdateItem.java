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


/**
 * @since Available in iOS 6.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UICollectionViewUpdateItem")
public class UICollectionViewUpdateItem 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UICollectionViewUpdateItem() { }

    
    @Mapping("indexPathBeforeUpdate")
    public native NSIndexPath getIndexPathBeforeUpdate();
    @Mapping("indexPathAfterUpdate")
    public native NSIndexPath getIndexPathAfterUpdate();
    @Mapping("updateAction")
    public native @Representing("UICollectionUpdateAction") long getUpdateAction();

    
    


}

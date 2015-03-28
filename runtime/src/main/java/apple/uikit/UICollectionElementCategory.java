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


@Library("UIKit/UIKit.h")
@Mapping("UICollectionElementCategory")
public final class UICollectionElementCategory extends ObjCEnum {
    
    @GlobalConstant("UICollectionElementCategoryCell")
    public static final long Cell = 0L;
    @GlobalConstant("UICollectionElementCategorySupplementaryView")
    public static final long SupplementaryView = 1L;
    @GlobalConstant("UICollectionElementCategoryDecorationView")
    public static final long DecorationView = 2L;


}

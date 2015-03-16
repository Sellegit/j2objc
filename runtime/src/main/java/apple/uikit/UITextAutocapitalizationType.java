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
@Mapping("UITextAutocapitalizationType")
public final class UITextAutocapitalizationType extends ObjCEnum {
    
    @GlobalConstant("UITextAutocapitalizationTypeNone")
    public static final long None = 0L;
    @GlobalConstant("UITextAutocapitalizationTypeWords")
    public static final long Words = 1L;
    @GlobalConstant("UITextAutocapitalizationTypeSentences")
    public static final long Sentences = 2L;
    @GlobalConstant("UITextAutocapitalizationTypeAllCharacters")
    public static final long AllCharacters = 3L;
    

}

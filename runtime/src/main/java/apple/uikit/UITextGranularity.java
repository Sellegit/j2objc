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





@Library("UIKit")
@Mapping("UITextGranularity")
public final class UITextGranularity extends ObjCEnum {
    
    @GlobalConstant("UITextGranularityCharacter")
    public static final long Character = 0L;
    @GlobalConstant("UITextGranularityWord")
    public static final long Word = 1L;
    @GlobalConstant("UITextGranularitySentence")
    public static final long Sentence = 2L;
    @GlobalConstant("UITextGranularityParagraph")
    public static final long Paragraph = 3L;
    @GlobalConstant("UITextGranularityLine")
    public static final long Line = 4L;
    @GlobalConstant("UITextGranularityDocument")
    public static final long Document = 5L;
    

}

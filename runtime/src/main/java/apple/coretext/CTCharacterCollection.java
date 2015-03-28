package apple.coretext;


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


@Library("CoreText/CoreText.h")
@Mapping("CTCharacterCollection")
public final class CTCharacterCollection extends ObjCEnum {
    
    @GlobalConstant("kCTCharacterCollectionIdentityMapping")
    public static final long CharacterCollectionIdentityMapping = 0L;
    @GlobalConstant("kCTCharacterCollectionAdobeCNS1")
    public static final long CharacterCollectionAdobeCNS1 = 1L;
    @GlobalConstant("kCTCharacterCollectionAdobeGB1")
    public static final long CharacterCollectionAdobeGB1 = 2L;
    @GlobalConstant("kCTCharacterCollectionAdobeJapan1")
    public static final long CharacterCollectionAdobeJapan1 = 3L;
    @GlobalConstant("kCTCharacterCollectionAdobeJapan2")
    public static final long CharacterCollectionAdobeJapan2 = 4L;
    @GlobalConstant("kCTCharacterCollectionAdobeKorea1")
    public static final long CharacterCollectionAdobeKorea1 = 5L;
    @GlobalConstant("kCTIdentityMappingCharacterCollection")
    public static final long IdentityMappingCharacterCollection = 0L;
    @GlobalConstant("kCTAdobeCNS1CharacterCollection")
    public static final long AdobeCNS1CharacterCollection = 1L;
    @GlobalConstant("kCTAdobeGB1CharacterCollection")
    public static final long AdobeGB1CharacterCollection = 2L;
    @GlobalConstant("kCTAdobeJapan1CharacterCollection")
    public static final long AdobeJapan1CharacterCollection = 3L;
    @GlobalConstant("kCTAdobeJapan2CharacterCollection")
    public static final long AdobeJapan2CharacterCollection = 4L;
    @GlobalConstant("kCTAdobeKorea1CharacterCollection")
    public static final long AdobeKorea1CharacterCollection = 5L;


}

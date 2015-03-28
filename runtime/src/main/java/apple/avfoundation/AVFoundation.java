package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("AVFoundation/AVFoundation.h")
public class AVFoundation 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVCoreAnimationBeginTimeAtZero")
    public static native double CoreAnimationBeginTimeAtZero();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyTitle")
    public static native NSString TitleValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyCreator")
    public static native NSString CreatorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeySubject")
    public static native NSString SubjectValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyDescription")
    public static native NSString DescriptionValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyPublisher")
    public static native NSString PublisherValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyContributor")
    public static native NSString ContributorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyCreationDate")
    public static native NSString CreationDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyLastModifiedDate")
    public static native NSString LastModifiedDateValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyType")
    public static native NSString TypeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyFormat")
    public static native NSString FormatValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyIdentifier")
    public static native NSString IdentifierValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeySource")
    public static native NSString SourceValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyLanguage")
    public static native NSString LanguageValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyRelation")
    public static native NSString RelationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyLocation")
    public static native NSString LocationValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyCopyrights")
    public static native NSString CopyrightsValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyAlbumName")
    public static native NSString AlbumNameValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyAuthor")
    public static native NSString AuthorValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyArtist")
    public static native NSString ArtistValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyArtwork")
    public static native NSString ArtworkValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyMake")
    public static native NSString MakeValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeyModel")
    public static native NSString ModelValue();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("AVMetadataCommonKeySoftware")
    public static native NSString SoftwareValue();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("AVMakeRectWithAspectRatioInsideRect")
    public static native CGRect createRectWithAspectRatioInsideRect(CGSize aspectRatio, CGRect boundingRect);

}

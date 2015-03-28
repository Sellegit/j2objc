package apple.imageio;


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

/*<javadoc>*/
/*</javadoc>*/
@Library("ImageIO/ImageIO.h")
public class CGImagePropertyIPTC 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCObjectTypeReference")
    public static native CFString ObjectTypeReferenceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCObjectAttributeReference")
    public static native CFString ObjectAttributeReferenceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCObjectName")
    public static native CFString ObjectNameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCEditStatus")
    public static native CFString EditStatusKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCEditorialUpdate")
    public static native CFString EditorialUpdateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCUrgency")
    public static native CFString UrgencyKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCSubjectReference")
    public static native CFString SubjectReferenceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCCategory")
    public static native CFString CategoryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCSupplementalCategory")
    public static native CFString SupplementalCategoryKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCFixtureIdentifier")
    public static native CFString FixtureIdentifierKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCKeywords")
    public static native CFString KeywordsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCContentLocationCode")
    public static native CFString ContentLocationCodeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCContentLocationName")
    public static native CFString ContentLocationNameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCReleaseDate")
    public static native CFString ReleaseDateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCReleaseTime")
    public static native CFString ReleaseTimeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCExpirationDate")
    public static native CFString ExpirationDateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCExpirationTime")
    public static native CFString ExpirationTimeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCSpecialInstructions")
    public static native CFString SpecialInstructionsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCActionAdvised")
    public static native CFString ActionAdvisedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCReferenceService")
    public static native CFString ReferenceServiceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCReferenceDate")
    public static native CFString ReferenceDateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCReferenceNumber")
    public static native CFString ReferenceNumberKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCDateCreated")
    public static native CFString DateCreatedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCTimeCreated")
    public static native CFString TimeCreatedKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCDigitalCreationDate")
    public static native CFString DigitalCreationDateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCDigitalCreationTime")
    public static native CFString DigitalCreationTimeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCOriginatingProgram")
    public static native CFString OriginatingProgramKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCProgramVersion")
    public static native CFString ProgramVersionKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCObjectCycle")
    public static native CFString ObjectCycleKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCByline")
    public static native CFString BylineKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCBylineTitle")
    public static native CFString BylineTitleKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCCity")
    public static native CFString CityKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCSubLocation")
    public static native CFString SubLocationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCProvinceState")
    public static native CFString ProvinceStateKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCCountryPrimaryLocationCode")
    public static native CFString CountryPrimaryLocationCodeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCCountryPrimaryLocationName")
    public static native CFString CountryPrimaryLocationNameKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCOriginalTransmissionReference")
    public static native CFString OriginalTransmissionReferenceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCHeadline")
    public static native CFString HeadlineKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCCredit")
    public static native CFString CreditKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCSource")
    public static native CFString SourceKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCCopyrightNotice")
    public static native CFString CopyrightNoticeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCContact")
    public static native CFString ContactKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCCaptionAbstract")
    public static native CFString CaptionAbstractKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCWriterEditor")
    public static native CFString WriterEditorKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCImageType")
    public static native CFString ImageTypeKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCImageOrientation")
    public static native CFString ImageOrientationKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCLanguageIdentifier")
    public static native CFString LanguageIdentifierKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCStarRating")
    public static native CFString StarRatingKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCCreatorContactInfo")
    public static native CFString CreatorContactInfoKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCRightsUsageTerms")
    public static native CFString RightsUsageTermsKey();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCGImagePropertyIPTCScene")
    public static native CFString SceneKey();

}

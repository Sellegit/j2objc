package apple.healthkit;


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



/**
 * @since Available in iOS 8.0 and later.
 */


@Mapping("HKWorkoutActivityType")
public final class HKWorkoutActivityType extends ObjCEnum {
    
    @GlobalConstant("HKWorkoutActivityTypeAmericanFootball")
    public static final long AmericanFootball = 1L;
    @GlobalConstant("HKWorkoutActivityTypeArchery")
    public static final long Archery = 2L;
    @GlobalConstant("HKWorkoutActivityTypeAustralianFootball")
    public static final long AustralianFootball = 3L;
    @GlobalConstant("HKWorkoutActivityTypeBadminton")
    public static final long Badminton = 4L;
    @GlobalConstant("HKWorkoutActivityTypeBaseball")
    public static final long Baseball = 5L;
    @GlobalConstant("HKWorkoutActivityTypeBasketball")
    public static final long Basketball = 6L;
    @GlobalConstant("HKWorkoutActivityTypeBowling")
    public static final long Bowling = 7L;
    @GlobalConstant("HKWorkoutActivityTypeBoxing")
    public static final long Boxing = 8L;
    @GlobalConstant("HKWorkoutActivityTypeClimbing")
    public static final long Climbing = 9L;
    @GlobalConstant("HKWorkoutActivityTypeCricket")
    public static final long Cricket = 10L;
    @GlobalConstant("HKWorkoutActivityTypeCrossTraining")
    public static final long CrossTraining = 11L;
    @GlobalConstant("HKWorkoutActivityTypeCurling")
    public static final long Curling = 12L;
    @GlobalConstant("HKWorkoutActivityTypeCycling")
    public static final long Cycling = 13L;
    @GlobalConstant("HKWorkoutActivityTypeDance")
    public static final long Dance = 14L;
    @GlobalConstant("HKWorkoutActivityTypeDanceInspiredTraining")
    public static final long DanceInspiredTraining = 15L;
    @GlobalConstant("HKWorkoutActivityTypeElliptical")
    public static final long Elliptical = 16L;
    @GlobalConstant("HKWorkoutActivityTypeEquestrianSports")
    public static final long EquestrianSports = 17L;
    @GlobalConstant("HKWorkoutActivityTypeFencing")
    public static final long Fencing = 18L;
    @GlobalConstant("HKWorkoutActivityTypeFishing")
    public static final long Fishing = 19L;
    @GlobalConstant("HKWorkoutActivityTypeFunctionalStrengthTraining")
    public static final long FunctionalStrengthTraining = 20L;
    @GlobalConstant("HKWorkoutActivityTypeGolf")
    public static final long Golf = 21L;
    @GlobalConstant("HKWorkoutActivityTypeGymnastics")
    public static final long Gymnastics = 22L;
    @GlobalConstant("HKWorkoutActivityTypeHandball")
    public static final long Handball = 23L;
    @GlobalConstant("HKWorkoutActivityTypeHiking")
    public static final long Hiking = 24L;
    @GlobalConstant("HKWorkoutActivityTypeHockey")
    public static final long Hockey = 25L;
    @GlobalConstant("HKWorkoutActivityTypeHunting")
    public static final long Hunting = 26L;
    @GlobalConstant("HKWorkoutActivityTypeLacrosse")
    public static final long Lacrosse = 27L;
    @GlobalConstant("HKWorkoutActivityTypeMartialArts")
    public static final long MartialArts = 28L;
    @GlobalConstant("HKWorkoutActivityTypeMindAndBody")
    public static final long MindAndBody = 29L;
    @GlobalConstant("HKWorkoutActivityTypeMixedMetabolicCardioTraining")
    public static final long MixedMetabolicCardioTraining = 30L;
    @GlobalConstant("HKWorkoutActivityTypePaddleSports")
    public static final long PaddleSports = 31L;
    @GlobalConstant("HKWorkoutActivityTypePlay")
    public static final long Play = 32L;
    @GlobalConstant("HKWorkoutActivityTypePreparationAndRecovery")
    public static final long PreparationAndRecovery = 33L;
    @GlobalConstant("HKWorkoutActivityTypeRacquetball")
    public static final long Racquetball = 34L;
    @GlobalConstant("HKWorkoutActivityTypeRowing")
    public static final long Rowing = 35L;
    @GlobalConstant("HKWorkoutActivityTypeRugby")
    public static final long Rugby = 36L;
    @GlobalConstant("HKWorkoutActivityTypeRunning")
    public static final long Running = 37L;
    @GlobalConstant("HKWorkoutActivityTypeSailing")
    public static final long Sailing = 38L;
    @GlobalConstant("HKWorkoutActivityTypeSkatingSports")
    public static final long SkatingSports = 39L;
    @GlobalConstant("HKWorkoutActivityTypeSnowSports")
    public static final long SnowSports = 40L;
    @GlobalConstant("HKWorkoutActivityTypeSoccer")
    public static final long Soccer = 41L;
    @GlobalConstant("HKWorkoutActivityTypeSoftball")
    public static final long Softball = 42L;
    @GlobalConstant("HKWorkoutActivityTypeSquash")
    public static final long Squash = 43L;
    @GlobalConstant("HKWorkoutActivityTypeStairClimbing")
    public static final long StairClimbing = 44L;
    @GlobalConstant("HKWorkoutActivityTypeSurfingSports")
    public static final long SurfingSports = 45L;
    @GlobalConstant("HKWorkoutActivityTypeSwimming")
    public static final long Swimming = 46L;
    @GlobalConstant("HKWorkoutActivityTypeTableTennis")
    public static final long TableTennis = 47L;
    @GlobalConstant("HKWorkoutActivityTypeTennis")
    public static final long Tennis = 48L;
    @GlobalConstant("HKWorkoutActivityTypeTrackAndField")
    public static final long TrackAndField = 49L;
    @GlobalConstant("HKWorkoutActivityTypeTraditionalStrengthTraining")
    public static final long TraditionalStrengthTraining = 50L;
    @GlobalConstant("HKWorkoutActivityTypeVolleyball")
    public static final long Volleyball = 51L;
    @GlobalConstant("HKWorkoutActivityTypeWalking")
    public static final long Walking = 52L;
    @GlobalConstant("HKWorkoutActivityTypeWaterFitness")
    public static final long WaterFitness = 53L;
    @GlobalConstant("HKWorkoutActivityTypeWaterPolo")
    public static final long WaterPolo = 54L;
    @GlobalConstant("HKWorkoutActivityTypeWaterSports")
    public static final long WaterSports = 55L;
    @GlobalConstant("HKWorkoutActivityTypeWrestling")
    public static final long Wrestling = 56L;
    @GlobalConstant("HKWorkoutActivityTypeYoga")
    public static final long Yoga = 57L;
    

}

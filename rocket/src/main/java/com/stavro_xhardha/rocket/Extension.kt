package com.stavro_xhardha.rocket

/**
 * Extension function for Rocket
 * @param [rocket] Your Rocket Instance
 * @return [Boolean] if the read String exists, the method returns true, else it returns false
 */
fun String.isDefaultString(rocket: Rocket): Boolean? = rocket.readString(this).isEmpty()

/**
 * Extension function for Rocket
 * @param [rocket] Your Rocket Instance
 * @return [Boolean] true if the read Int exists, false if not
 */
fun String.isDefaultInt(rocket: Rocket): Boolean = rocket.readInt(this) == 0

/**
 * Extension function for Rocket
 * @param [rocket] Your Rocket Instance
 * @return [Boolean] true if the read Float exists, false if not
k */
fun String.isDefaultFloat(rocket: Rocket): Boolean = rocket.readFloat(this) == 0f

/**
 * Extension function for Rocket
 * @param [rocket] Your Rocket Instance
 * @return [Boolean] true if the read Boolean exists, false if not
 */
fun String.isDefaultBoolean(rocket: Rocket): Boolean = rocket.readBoolean(this)

/**
 * Extension function for Rocket
 * @param [rocket] Your Rocket Instance
 * @return [Boolean] true if the read Long exists, false if not
 */
fun String.isDefaultLong(rocket: Rocket): Boolean = rocket.readLong(this) == 0L
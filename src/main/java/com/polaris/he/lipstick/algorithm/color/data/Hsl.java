package com.polaris.he.lipstick.algorithm.color.data;

import lombok.*;

/**
 * User: hexie
 * Date: 2018-12-23 16:50
 * Description:
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Hsl implements Color {

    private double h;
    private double s;
    private double l;

    @Override
    public ColorSystemEnum colorSystem() {
        return ColorSystemEnum.HSL;
    }
}
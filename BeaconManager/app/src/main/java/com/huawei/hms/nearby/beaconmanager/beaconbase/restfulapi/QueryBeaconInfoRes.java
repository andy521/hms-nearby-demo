/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.hms.nearby.beaconmanager.beaconbase.restfulapi;

import com.huawei.hms.nearby.beaconmanager.beaconbase.model.BeaconInfo;

import com.google.gson.annotations.SerializedName;

/**
 * Query Beacon Detail information Response
 *
 * @since 2019-11-13
 */
public class QueryBeaconInfoRes extends CloudResponse {
    @SerializedName("beacon")
    private BeaconInfo beaconInfo;

    public BeaconInfo getBeaconInfo() {
        return beaconInfo;
    }
}
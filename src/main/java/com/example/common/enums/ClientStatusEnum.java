package com.example.common.enums;

import java.util.Arrays;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 0:第一次註冊
 * 5:通過email驗證，尚未送出基本資料
 * 20:基本資料送出，待指派業務
 * 40:業務助理審核完成
 * 60:業務審核完成
 * 100:業務主管審核完成
 * -1:遭到停用
 * -99:遭到禁用
 * @author aszxjohn
 *
 */

@Getter
@AllArgsConstructor
public enum ClientStatusEnum {
	NEW_REGISTRATION(0, "第一次註冊"),
    EMAIL_VERIFIED(5, "通過email驗證，尚未送出基本資料"),
    BASIC_INFO_SUBMITTED(20, "基本資料送出，待指派業務"),
    ASSISTANT_REVIEWED(40, "業務助理審核完成"),
    STAFF_REVIEWED(60, "業務審核完成"),
    MANAGER_REVIEWED(100, "業務主管審核完成"),
    SUSPENDED(-1, "遭到停用"),
    BANNED(-99, "遭到禁用");
	
	private final int status;
	private final String description;
	
	public static ClientStatusEnum getClientStatusEnum(int clientStatus) {
		Optional<ClientStatusEnum> statusEnum = Arrays.stream(values()).filter(vn -> vn.getStatus() == clientStatus)
				.findFirst();
		return statusEnum.isPresent() ? statusEnum.get() : null;
	}
}

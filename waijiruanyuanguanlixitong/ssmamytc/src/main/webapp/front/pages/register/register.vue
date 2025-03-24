<template>
	<view class="content">
		<view class="logo" v-if="true">
			<image :style='{"boxShadow":"0 0 0px #59f43e","borderColor":"#ccc","borderRadius":"200rpx","borderWidth":"0px","width":"200rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20201209/3ae66a2ca46342eeb7323c7bd624b6f4.jpg","isShow":true,"height":"200rpx"}' src='http://codegen.caihongy.cn/20201209/3ae66a2ca46342eeb7323c7bd624b6f4.jpg' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shenfenzhenghao" type="text" class="uni-input" name="" placeholder="身份证号" />
		</view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xingming" type="text" class="uni-input" name="" placeholder="姓名" />
		</view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.chushengriqi" type="text" class="uni-input" name="" placeholder="出生日期" />
		</view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
                        <picker @change="wailairenkouxingbieChange" :value="wailairenkouxingbieIndex" :range="wailairenkouxingbieOptions">
                                <view :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.minzu" type="text" class="uni-input" name="" placeholder="民族" />
		</view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.zhiye" type="text" class="uni-input" name="" placeholder="职业" />
		</view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
                        <picker @change="wailairenkouhunyinzhuangkuangChange" :value="wailairenkouhunyinzhuangkuangIndex" :range="wailairenkouhunyinzhuangkuangOptions">
                                <view :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input">{{ruleForm.hunyinzhuangkuang?ruleForm.hunyinzhuangkuang:"请选择婚姻状况"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.wenhuachengdu" type="text" class="uni-input" name="" placeholder="文化程度" />
		</view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.xuexing" type="text" class="uni-input" name="" placeholder="血型" />
		</view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.shouji" type="text" class="uni-input" name="" placeholder="手机" />
		</view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.jiankangzhuangkuang" type="text" class="uni-input" name="" placeholder="健康状况" />
		</view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.zanzhudizhi" type="text" class="uni-input" name="" placeholder="暂住地址" />
		</view>
		<view v-if="tableName=='wailairenkou'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.hujisuozaidi" type="text" class="uni-input" name="" placeholder="户籍所在地" />
		</view>
		<view v-if="tableName=='paichusuo'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.zhanghao" type="text" class="uni-input" name="" placeholder="账号" />
		</view>
		<view v-if="tableName=='paichusuo'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='paichusuo'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.paichusuomingcheng" type="text" class="uni-input" name="" placeholder="派出所名称" />
		</view>
		<view v-if="tableName=='paichusuo'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.fuzeren" type="text" class="uni-input" name="" placeholder="负责人" />
		</view>
		<view v-if="tableName=='paichusuo'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.dianhua" type="text" class="uni-input" name="" placeholder="电话" />
		</view>
		<view v-if="tableName=='paichusuo'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.youxiang" type="text" class="uni-input" name="" placeholder="邮箱" />
		</view>
		<view v-if="tableName=='paichusuo'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.dizhi" type="text" class="uni-input" name="" placeholder="地址" />
		</view>
		<view v-if="tableName=='paichusuo'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.wangzhi" type="text" class="uni-input" name="" placeholder="网址" />
		</view>
		<view v-if="tableName=='paichusuo'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(199, 21, 133, 1)","backgroundColor":"rgba(248, 248, 248, 1)","borderRadius":"0px","color":"rgba(199, 21, 133, 1)","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.fuwushijian" type="text" class="uni-input" name="" placeholder="服务时间" />
		</view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"rgba(254, 254, 254, 1)","backgroundColor":"rgba(153, 0, 51, 1)","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0px","fontSize":"32rpx","borderStyle":"solid","height":"90rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
                                wailairenkouxingbieOptions: [],
                                wailairenkouxingbieIndex: 0,
                                wailairenkouhunyinzhuangkuangOptions: [],
                                wailairenkouhunyinzhuangkuangIndex: 0,
				ruleForm: {
				},
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='wailairenkou'){
                        	this.wailairenkouxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.wailairenkouxingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='wailairenkou'){
                        	this.wailairenkouhunyinzhuangkuangOptions = "已婚,未婚".split(',');
				this.ruleForm.hunyinzhuangkuang=this.wailairenkouhunyinzhuangkuangOptions[0]
			}
			
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        wailairenkouxingbieChange(e) {
                                this.wailairenkouxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.wailairenkouxingbieOptions[this.wailairenkouxingbieIndex]
                        },
                        // 下拉变化
                        wailairenkouhunyinzhuangkuangChange(e) {
                                this.wailairenkouhunyinzhuangkuangIndex = e.target.value
                                this.ruleForm.hunyinzhuangkuang = this.wailairenkouhunyinzhuangkuangOptions[this.wailairenkouhunyinzhuangkuangIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.shenfenzhenghao) && `wailairenkou` == this.tableName){
					this.$utils.msg(`身份证号不能为空`);
					return
				}
				if(`wailairenkou` == this.tableName && this.ruleForm.shenfenzhenghao&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzhenghao))){
					this.$utils.msg(`身份证号应输入身份证格式`);
					return
				}
				if((!this.ruleForm.mima) && `wailairenkou` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `wailairenkou` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if(`wailairenkou` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if((!this.ruleForm.zhanghao) && `paichusuo` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `paichusuo` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.fuzeren) && `paichusuo` == this.tableName){
					this.$utils.msg(`负责人不能为空`);
					return
				}
				if(`paichusuo` == this.tableName && this.ruleForm.youxiang&&(!this.$validate.isEmail(this.ruleForm.youxiang))){
					this.$utils.msg(`邮箱应输入邮件格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 80rpx;
}

</style>
